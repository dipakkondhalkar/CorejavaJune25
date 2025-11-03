import java.util.Scanner;
public class TemperatureClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double temp = sc.nextDouble();
        if (temp < 0)
            System.out.println("Freezing");
        else if (temp <= 20)
            System.out.println("Cold");
        else if (temp <= 35)
            System.out.println("Warm");
        else
            System.out.println("Hot");
    }
}