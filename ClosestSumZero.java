/*Q13. Write a program in java to find two elements whose sum is closest to zero
Expected Output :
 The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
 The Pair of elements whose sum is minimum are:
 [44, -46]   */
 

import java.util.Arrays;

public class ClosestSumZero {
    public static void main(String[] args) {
        int[] arr = {38, 44, 63, -51, -35, 19, 84, -69, 4, -46};

        System.out.println("The given array is: " + Arrays.toString(arr));

        int n = arr.length;
        int minSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        // Check every pair (i, j) and update minSum and pair if current sum is closer to 0
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println("The Pair of elements whose sum is minimum are:");
        System.out.println("[" + num1 + ", " + num2 + "]");
    }
}
/*
output:

The given array is: [38, 44, 63, -51, -35, 19, 84, -69, 4, -46]
The Pair of elements whose sum is minimum are:
[44, -46]   */
