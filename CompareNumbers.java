import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b)
            System.out.println("First number is greater.");
        else if (a < b)
            System.out.println("Second number is greater.");
        else
            System.out.println("Both numbers are equal.");
    }
}