import java.util.Scanner;
public class EqualCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a == b)
         System.out.println("Equal");
        else
        System.out.println("Not Equal");
    }
}