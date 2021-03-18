package practice.arrays.sorting;

import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        int arr[] = {7,6,10,5,9,2,1,15,7};
        int n = arr.length;

        QuickSortImplement ob = new QuickSortImplement();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array : "+Arrays.toString(arr));
    }
}

class QuickSortImplement {
    int partition(int[] a , int lb, int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;
        int temp;
        while (start<end) {
            while (a[start] <= pivot) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            // swap start with end only till start's index is less than end's
            if (start <= end) {
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        // when end's index becomes less than start's, swap end with pivot
        temp = a[end];
        a[end] = a[lb];
        a[lb] = temp;
        return end;
        }

        void sort(int[] a , int lb, int ub) {
            if(lb<ub) {
                int pivotIndex = partition(a, lb, ub);
                sort(a, lb, pivotIndex-1);
                sort(a, pivotIndex+1, ub);
            }
        }
}
