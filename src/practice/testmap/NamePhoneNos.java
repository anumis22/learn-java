package practice.testmap;

import java.util.*;

public class NamePhoneNos {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            map.put(name, name+"="+phone);
            in.nextLine();
        }
        List<String> l = new ArrayList<>();
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(map.containsKey(s))
                System.out.println(map.get(s)) ;
            else
                System.out.println("Not found");
        }

    }
}
