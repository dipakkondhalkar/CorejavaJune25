import java.util.Scanner;
public class VehicleProduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total vehicles: ");
        int v = sc.nextInt();
        System.out.print("Enter total wheels: ");
        int w = sc.nextInt();
        if (w >= 2 * v && w <= 4 * v && (w % 2 == 0)) {
            int tw = (4 * v - w) / 2;
            int fw = v - tw;
            System.out.println("Two Wheelers: " + tw);
            System.out.println("Four Wheelers: " + fw);
        } else {
            System.out.println("Invalid input");
        }
    }
}