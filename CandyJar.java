import java.util.Scanner;
public class CandyJar {
    public static void main(String[] args) {
        final int N = 10;
        final int K = 5;
        int candiesInJar = N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of candies to buy: ");
        int order = sc.nextInt();
        if (order <= 0 || order > candiesInJar) {
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF CANDIES LEFT : " + candiesInJar);
        } else {
            candiesInJar -= order;
            System.out.println("NUMBER OF CANDIES SOLD : " + order);
            System.out.println("NUMBER OF CANDIES AVAILABLE : " + candiesInJar);
            if (candiesInJar <= K) {
                candiesInJar = N;
                System.out.println("JAR is refilled to full: " + candiesInJar + " candies");
            }
        }
    }
}