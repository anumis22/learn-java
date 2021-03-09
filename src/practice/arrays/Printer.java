package practice.arrays;

import java.lang.reflect.Method;

class Printer1 {
    static <T> void printArray(T[] a) {
        for (T e: a)
            System.out.println(e);
    }
}

public class Printer {
    public static void main(String[] args) {
        Printer1 myPrinter = new Printer1();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
