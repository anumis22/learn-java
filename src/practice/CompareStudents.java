package practice;

import java.util.*;

class Student1 implements Comparable{
    private int id;
    private String fname;
    private double cgpa;
    public Student1(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override public int compareTo(Object o) {
        if(((Student1)o).getCgpa()==this.getCgpa())
            return ((Student1)o).getFname().compareTo(this.getFname());
        else if(((Student1)o).getFname().equals(this.getFname()))
            return ((Student1)o).getId()-this.getId();
        else
            return (int)this.getCgpa() -(int)((Student1)o).getCgpa();
    }
}
/*class StudentCompare implements Comparator<Student1>{
    @Override public int compare(Student1 o1, Student1 o2) {
        if(o1.getCgpa()==o2.getCgpa())
            return o1.getFname().compareTo(o2.getFname());
        else if(o1.getFname().equals(o2.getFname()))
            return o1.getId()-o2.getId();
        else
            return (int)o2.getCgpa() - (int)o1.getCgpa();
    }
}*/

public class CompareStudents {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        TreeSet<Student1> s = new TreeSet<>();
        List<Student1> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student1 st = new Student1(id, fname, cgpa);
            studentList.add(st);
            s.add(st);

            testCases--;
        }
        Comparator<Student1> byCgpa = Comparator.comparing(Student1::getCgpa).reversed();
        Comparator<Student1> byFname = Comparator.comparing(Student1::getFname);
        Comparator<Student1> byId = Comparator.comparing(Student1::getId);
        Collections.sort(studentList);
        for(Student1 st: studentList){
            System.out.println(st.getFname());
        }
    }
}
