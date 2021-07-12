package basics;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        findSmallest(arr);
    }
    static void findSmallest(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<first)
            {
                second = first;
                first=arr[i];
            }
            if(arr[i]>first && arr[i]<second)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second " +
                "smallest element");
        else
            System.out.println("The smallest element is " +
                first + " and second Smallest" +
                " element is " + second);
    }
}
