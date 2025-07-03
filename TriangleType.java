import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first side: ");
        int side1 = sc.nextInt();

        System.out.print("Input second side: ");
        int side2 = sc.nextInt();

        System.out.print("Input third side: ");
        int side3 = sc.nextInt();
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {

            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            }
            else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            }
            else {
                System.out.println("The triangle is Scalene.");
            }

        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
}
