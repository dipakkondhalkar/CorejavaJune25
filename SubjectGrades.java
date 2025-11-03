import java.util.Scanner;
public class SubjectGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Physics, Chemistry, Biology, Mathematics and Computer: ");
        int phy = sc.nextInt(), chem = sc.nextInt(), bio = sc.nextInt(), math = sc.nextInt(), comp = sc.nextInt();
        int total = phy + chem + bio + math + comp;
        double percent = total / 5.0;
        String grade;
        if (percent >= 90) grade = "Grade A";
        else if (percent >= 80) grade = "Grade B";
        else if (percent >= 70) grade = "Grade C";
        else if (percent >= 60) grade = "Grade D";
        else if (percent >= 40) grade = "Grade E";
        else grade = "Grade F";
        System.out.println("Percentage: " + percent);
        System.out.println("Grade: " + grade);
    }
}