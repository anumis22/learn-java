package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray {
    private int[] array;
    private int count;
    DynamicArray(int length) {
        array = new int[length];
    }

    public void insert(int x) {
        // If array is full, resize
        if(array.length == count) {
            int[] newArr = new int[count*2];
            for(int i=0;i<count;i++)
                newArr[i] = array[i];
            array = newArr;
        }
        // Add new item at the end
        array[count++] = x;
    }

    public void removeAt(int index) {
        if(index < 0 || index>=count)
            throw new IllegalArgumentException();
        for (int i=index; i< count; i++) {
            array[i] = array[i+1];
        }
        count--;
    }

    public int indexOf(int item) {
        for(int i=0; i<count; i++) {
            if(item == array[i])
                return i;
        }
        return -1;
    }

    public void print() {
        for(int i=0; i<count; i++)
            System.out.println(array[i]);
    }

    public static void main(String[] args) {
        DynamicArray num = new DynamicArray(3);
        num.insert(1);
        num.insert(2 );
        num.insert(23);
        num.insert(24);
//        num.removeAt(4);
        System.out.println(num.indexOf(23));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(0);
        System.out.println(list);
    }

}
