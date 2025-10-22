import java.util.Scanner;

import Array.ArrayRotator;

public class MainArray {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] nums = new int[n];

	       
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            nums[i] = sc.nextInt();
	        }

	       
	        System.out.print("Enter k (number of rotations): ");
	        int k = sc.nextInt();

	     
	        ArrayRotator.rotate(nums, k);

	       
	        System.out.print("Rotated Array: ");
	        ArrayRotator.printArray(nums);

	        sc.close();

	}

}
