import java.util.Scanner;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double bs = sc.nextDouble();
        double hra, da;
        if (bs <= 10000) {
            hra = bs * 0.20;
            da = bs * 0.80;
        } else if (bs <= 20000) {
            hra = bs * 0.25;
            da = bs * 0.90;
        } else {
            hra = bs * 0.30;
            da = bs * 0.95;
        }
        double gross = bs + hra + da;
        System.out.println("Gross Salary: " + gross);
    }
}