import java.util.*;
public class NetSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter HRA%: ");
        double hra = sc.nextDouble();
        System.out.print("Enter DA%: ");
        double da = sc.nextDouble();
        System.out.print("Enter Tax%: ");
        double tax = sc.nextDouble();

        double gross = basic + (basic * hra / 100) + (basic * da / 100);
        double net = gross - (gross * tax / 100);
        System.out.println("Net Salary: " + net);
    }
}