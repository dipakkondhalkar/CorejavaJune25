import java.util.Scanner;
public class MinOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a < b)
            System.out.println("Minimum is: " + a);
        else
            System.out.println("Minimum is: " + b);
    }
}