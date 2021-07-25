package basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestFinally {
    public static void main(String[] args) {
        try{
            System.out.println("2");
            throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
