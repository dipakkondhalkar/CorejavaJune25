//Q20. Sum of Digits (Using Operators)

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int d1 = num % 10;
        int d2 = (num / 10) % 10;
        int d3 = (num / 100) % 10;

        int sum = d1 + d2 + d3;
        System.out.println("Sum of digits: " + sum);
    }
}

