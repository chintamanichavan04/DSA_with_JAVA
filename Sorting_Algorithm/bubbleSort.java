package Sorting_Algorithm;


// As we are using two Loops so Time Complexity will be O(n^2);
public class bubbleSort {
    static void bubble_sort(int[] nums, int n){
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
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
        
        bubble_sort(nums, n);
    }
}
