import java.util.Scanner;
public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter attendance % and marks: ");
        double attendance = sc.nextDouble(), marks = sc.nextDouble();
        if (attendance >= 75 && marks >= 80)
            System.out.println("Eligible for scholarship.");
        else
            System.out.println("Not eligible.");
    }
}