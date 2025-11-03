import java.util.Scanner;
public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        System.out.println(sqrt == (int) sqrt ? "Perfect Square" : "Not Perfect Square");
    }
}