import java.util.Scanner;
public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();
        int fine = 0;
        String status = "Membership active";
        if (days <= 5)
            fine = days * 2;
        else if (days <= 10)
            fine = days * 3;
        else if (days <= 30)
            fine = days * 5;
        else {
            fine = 500;
            status = "Membership cancelled";
        }
        System.out.println("Fine: ₹" + fine);
        System.out.println("Status: " + status);
    }
}