import java.util.Scanner;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int first = num / 100;

        int sum = first + last;
        System.out.println("Sum of first and last digit: " + sum);
    }
}