package Sorting_Algorithm;

public class selectionSort {

    // As we are using two Loops so Time Complexity will be O(n^2);
    static void selection_sort(int[] nums, int n){
        for(int i=0; i<n-1; i++){
            int mini = i;
            for(int j=i+1; j<n; j++){
                if(nums[j]<nums[mini]){
                    mini = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[mini];
            nums[mini] = temp;
        }
        System.out.println("Elements after Sorting:");
        for(int num: nums){
            System.out.print(num+" ");
        } 
    }
    public static void main(String[] args) {
        int nums[] = {13, 46, 24, 52, 20, 9};

        int n = nums.length;
        System.out.println("Elemnts Befor using the Bubble Sort");
        for(int num: nums){
            System.out.print(num+" ");
        }
        System.out.println();
        selection_sort(nums, n);
    }
}
