package basics;

import java.util.Arrays;
import java.util.List;

public class PredatorProblem {
    public static void main(String[] args) {
        List<Integer> predatorArray = Arrays.asList(-1, 8, 6, 0, 7, 3, 8, 9, -1, 6, 1);
        int minGroups = 1;
        int size = predatorArray.size();
        for (int i = 0; i < size; i++)
        {
            int a = i; // 0, 1, 2 , 3
            int counter = 1;
            while (predatorArray.get(a) > -1 && predatorArray.get(a) < size && counter < size)
            {
                a = predatorArray.get(a);  // a = 8   ,  6  ,    8 ,  0 ,
                counter++;   // 2, 3 , 4 , 2
            }

            if (counter > minGroups)
                minGroups = counter;  // 2  , 4
        }
        System.out.println(minGroups);
    }
}
