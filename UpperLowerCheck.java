import java.util.Scanner;
public class UpperLowerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch))
            System.out.println("Uppercase Alphabet");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase Alphabet");
        else
            System.out.println("Not an Alphabet");
    }
}