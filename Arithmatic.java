/*Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
*/
import java.util.*;
public class Arithmatic{
public static void main(String[]args){

int dividend, divisor, quotient , remainder ;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the dividend");
dividend = sc.nextInt();

System.out.println(" Enter the divisor ");
divisor = sc.nextInt();

quotient = dividend / divisor;

System.out.println(" Quotient is :" + quotient);
remainder = dividend % divisor;
System.out.println(" remainder is :" + remainder);
}
}
