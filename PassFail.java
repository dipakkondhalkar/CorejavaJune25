import java.util.Scanner;
public class PassFail {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's score: ");
        int score = sc.nextInt();
        System.out.println(score >= 40 ? "Pass" : "Fail");
    }
}