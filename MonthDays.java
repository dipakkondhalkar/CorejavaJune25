import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Input month number (1-12): ");
   int month = sc.nextInt();
   switch (month) {
            case 1:  
            case 3:  
            case 5:  
            case 7:  
            case 8:  
            case 10: 
            case 12: 
           System.out.println("Total number of days = 31");
                break;

            case 4: 
            case 6:  
            case 9:  
            case 11: 
                System.out.println("Total number of days = 30");
                break;

            case 2: 
            System.out.println("Total number of days = 28/29");
                break;

            default:
            System.out.println("Invalid month number! Please enter between 1 and 12.");
        }
    }
}
