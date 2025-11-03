import java.util.Scanner;
public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();
        double commission;
        if (sales < 5000)
            commission = sales * 0.02;
        else if (sales <= 10000)
            commission = sales * 0.05;
        else
            commission = sales * 0.10;
        System.out.println("Commission: " + commission);
    }
}