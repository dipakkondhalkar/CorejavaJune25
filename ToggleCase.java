import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        } else if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);
        }
        System.out.println("Toggled case: " + ch);
    }
}
/*output :
Enter an alphabet: w
Toggled case: W
*/