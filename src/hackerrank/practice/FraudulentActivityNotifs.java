package hackerrank.practice;

import java.util.Scanner;

public class FraudulentActivityNotifs {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int median;
        int index;
        int notifCount = 0;
        for(int i=0;i<expenditure.length;i++) {
            for(int j=i; j<i+d; j++) {
                if(expenditure[j] > expenditure[j+1]) {
                    int temp = expenditure[j];
                    expenditure[j] = expenditure[j+1];
                    expenditure[j+1] = temp;
                }
                if(d%2 == 0) {
                    index = d/2;
                    median = (expenditure[index] + expenditure[index+1])/2;
                } else {
                    index = Math.round(d/2);
                    median = expenditure[index];
                }
                if(median*2 < expenditure[j+d])
                    notifCount++;
            }
        }
        return notifCount;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int d = 3;
        int[] expenditure = {10,20,30,40,50};
        int result = activityNotifications(expenditure, d);
        System.out.println(result);
        scanner.close();
    }
}
