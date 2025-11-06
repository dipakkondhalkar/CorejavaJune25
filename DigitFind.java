//Q18. Write a java program to find the first and last digit of a number

import java.util.*;
class DigitFind
{
public static void main(String[]args)
{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number ");
      int no = sc.nextInt();

   Digit a = new Digit();
   a.getDigit(no);
  }
}
 
class Digit
{
  public int getDigit(int no)
   {
     
    int last = no % 10;//Remove last Digit from the number.
	int first = no;
     while(first>10)
	 {
	   first = first/10;//Continous remove the digit until first digit get , 10---  because no greater than 10 is there.
	 
	 } 
	  System.out.println("Last Digit is " + last);//Always outside we should print it .
	  System.out.println("First Digit is " + first);
	   
	 return no; // return require when we give method in int so.
	 }
   }
/*
output:
Enter the number
1234
Last Digit is 4
First Digit is 1  */