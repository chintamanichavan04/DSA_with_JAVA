package Sorting_Algorithm;

public class insertionSort {
    static void insertion_sort(int[] nums, int n){
        for(int i=0; i<n; i++){
            int j = i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp  = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
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
        insertion_sort(nums, n);
    }
}
