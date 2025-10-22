package Array;

import java.util.Arrays;

public class ArrayRotator {
	public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

   
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

   
    public static void printArray(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }

}
