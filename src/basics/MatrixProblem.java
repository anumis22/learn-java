package basics;

import java.util.*;
import java.util.stream.Collectors;

public class MatrixProblem {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        var vegetables = new ArrayList<>();
        vegetables.add("Brocolli");
        vegetables.add("Carrot");
        vegetables.add("Celery");
        var unmodifiable = vegetables.stream().collect(Collectors.toUnmodifiableList());
        vegetables.set(0, "Radish");
        var v = unmodifiable.get(0);
        System.out.println(v);
        a[0][0]=2;
        a[0][1]=0;
        a[0][2]=3;
        a[0][3]=1;
        a[1][0]=1;
        a[1][1]=1;
        a[1][2]=2;
        a[1][3]=3;
        a[2][0]=3;
        a[2][1]=3;
        a[2][2]=1;
        a[2][3]=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        processMatrixMap(a);
    }

    private static void processMatrixMap(int[][] a) {
        HashMap<Integer, Integer> rowColMap = new HashMap<>();

        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i][j] == 0) {
                    rowColMap.put(i, j);
                }
            }
        }

        for(Map.Entry<Integer, Integer> m:rowColMap.entrySet()) {
            //first setting row values zero
            for (int j = 0; j < 4; j++) {
                a[m.getKey()][j] =0;
            }
            for(int i=0;i<3;i++){
                a[i][m.getValue()]=0;
            }
        }

        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
