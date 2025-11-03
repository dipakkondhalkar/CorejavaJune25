import java.util.Scanner;
public class SalaryHikeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary, years of service, and rating (1-5): ");
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        int rating = sc.nextInt();
        double hike;
        if (rating >= 4 && years > 5)
            hike = 0.20;
        else if (rating >= 3)
            hike = 0.10;
        else
            hike = 0.05;
        double newSalary = salary + (salary * hike);
        System.out.println("New Salary: " + newSalary);
    }
}