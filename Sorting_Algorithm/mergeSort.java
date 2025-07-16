package Sorting_Algorithm;

import java.util.*;

class Solution {
    private static void merge(int[] arr, int left, int m, int r){
        ArrayList<Integer>temp = new ArrayList<>();
        int l = left;
        int right = m+1;
        while(l<=m && right<=r){
            if(arr[l]<=arr[right]){
                temp.add(arr[l]);
                l++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(l<=m){
            temp.add(arr[l]);
            l++;
        }

        while(right<=r){
            temp.add(arr[right]);
            right++;
        }

        for(int i=left; i<=r; i++){
            arr[i] = temp.get(i-left);
        }
    }

    public static void mergeSort(int[] arr, int l, int r){
        if(l>=r)return;
        int m  = (l+r)/2;

        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr, l, m, r);
    }
}

public class mergeSort {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.mergeSort(arr, 0, n-1);
        System.out.println("After sorting array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
