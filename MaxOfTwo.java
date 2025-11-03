import java.util.Scanner;
public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b)
            System.out.println("Maximum is: " + a);
        else
            System.out.println("Maximum is: " + b);
    }
}