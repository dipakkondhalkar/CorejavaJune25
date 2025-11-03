import java.util.Scanner;
public class GradeResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score (0-100): ");
        int score = sc.nextInt();
        String result = (score >= 90) ? "Excellent" :
                        (score >= 75) ? "Good" :
                        (score >= 50) ? "Average" : "Poor";
        System.out.println("Grade: " + result);
    }
}