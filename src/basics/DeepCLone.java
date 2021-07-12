package basics;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Course1 implements Cloneable{
    int id;
    String courseName;

    public Course1(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    @Override protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student1 implements Cloneable {
    int id;
    String name;
    Course1 course;

    public Student1(int id, String name, Course1 course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override protected Object clone() throws CloneNotSupportedException {
        Student1 student = (Student1)super.clone();
        Course1 course = (Course1) this.course.clone();
        student.course = course;
        return student;
    }
}
public class DeepCLone {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(makeMap(new String[]{"one", "two", "three", "four", "five"}, new Integer[]{1, 2, 3, 4, 5}));
    }

    public static <A,B> Map<A, B> makeMap(A[] keys, B[] values) {
        Map<A,B> m1 = new HashMap<>();
        Long[] numbers = new Long[20000];
        Long reallyBig = new Long("1234567890123456890");
        numbers[0] = reallyBig;
        Random rnd = new Random();
        for (int i=0; i<50*1024*1024; i++){
            numbers[(int) i] = Long.valueOf(rnd.nextInt(10));
        }
        return null;
    }
}

