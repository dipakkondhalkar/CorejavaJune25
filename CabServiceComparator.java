import java.util.Scanner;
public class CabServiceComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.print("Enter cost of Cab 1 and Cab 2: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x < y)
                System.out.println("Choose Cab 1");
            else if (y < x)
                System.out.println("Choose Cab 2");
            else
                System.out.println("Any Cab");
        }
    }
}