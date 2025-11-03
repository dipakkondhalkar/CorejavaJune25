import java.util.Scanner;
public class MobileBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total minutes used: ");
        int mins = sc.nextInt();
        double bill = 199;
        if (mins <= 100)
            bill = 199;
        else if (mins <= 300)
            bill += (mins - 100) * 1;
        else if (mins <= 500)
            bill += 200 * 1 + (mins - 300) * 1.5;
        else
            bill += 200 * 1 + 200 * 1.5 + (mins - 500) * 2;
        System.out.println("Total bill: ₹" + bill);
    }
}