import java.util.Scanner;
public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Triangle is valid");
        else
            System.out.println("Triangle is not valid");
    }
}