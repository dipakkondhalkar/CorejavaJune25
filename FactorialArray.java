//Q5. Replace each element with its factorial.
//Explanation: Use a loop to compute factorials for each element.

import java.util.*;

public class FactorialArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        getFactorial(a); 
    }

    public static void getFactorial(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int fact = 1;
            for (int j = 1; j <= a[i]; j++) {
                fact *= j;
            }
            a[i] = fact; //  Replace element with its factorial
        }

        System.out.println("Factorials of the given elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
/*
output:
Enter the elements in the array:
1
2
3
4
5
Factorials of the given elements:
1 2 6 24 120   */