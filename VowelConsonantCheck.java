import java.util.Scanner;
public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
         System.out.println("Vowel");
        else if ((ch >= 'a' && ch <= 'z'))
         System.out.println("Consonant");
        else
            System.out.println("Not an alphabet");
    }
}