// days in years month ,year , week.

import java.util.Scanner;

public class ConvertDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int years = days / 365;
        int months = (days % 365) / 30;
        int weeks = ((days % 365) % 30) / 7;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Weeks: " + weeks);
    }
}


