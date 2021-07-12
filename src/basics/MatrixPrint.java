package basics;

import java.util.Arrays;

public class MatrixPrint {
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        for(int i=1;i<=5;i++){
            System.out.print(i+"\t");
            if(i==5) {
                System.out.println();
                for(int j=3;j>=0;j--){
                    for(int x=0;x<4;x++)
                        if(x+j == 3)
                            a[x][j] = ++i;
                }
                for(int x=0;x<4;x++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(a[x][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}
