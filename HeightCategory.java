import java.util.Scanner;
public class HeightCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        if (height < 150.0)
            System.out.println("The person is Dwarf.");
        else if (height >= 150.0 && height < 165.0)
            System.out.println("The person is average heighted.");
        else if (height >= 165.0 && height <= 195.0)
            System.out.println("The person is taller.");
        else
            System.out.println("Height out of range.");
    }
}