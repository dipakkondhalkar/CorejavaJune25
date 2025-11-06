//Q18. Write a java program to find the first and last digit of a number

import java.util.*;
class DigitFind
{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int no = sc.nextInt();
   System.out.println("Enter the number ");
   Digit a = new Digit();
   a.getDigit(no);
  }
}
 
class Digit
{
  public int getDigit(int no)
   {
     
    int last = no % 10;
	int first = no;
     while(first>10)
	 {
	   first = first/10;
	 
	  System.out.println("Last Digit is " + last);
	  System.out.println("First Digit is " + first);
	   
	 } 
	 
	 return no;
	 }
   }

