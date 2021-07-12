package basics;

class Course implements Cloneable{
    int id;
    String courseName;

    public Course(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    @Override protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student implements Cloneable {
    int id;
    String name;
    Course course;

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course c1 = new Course(1,"Maths");
        Student s1 = new Student(1,"Anu",c1);
        Student s2 = (Student)s1.clone();
        System.out.println(s1.hashCode());
        System.out.println(s1.course.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.course.hashCode());
        System.out.println(s2.course.equals(s1.course));
    }
}
