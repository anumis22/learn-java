package practice.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        int Q = sc.nextInt();
        for(int i =0;i<Q;i++) {
            String action = sc.next();
            if(action.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else {
                int index = sc.nextInt();
                list.remove(index);
            }
        }

        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i));
    }
}
