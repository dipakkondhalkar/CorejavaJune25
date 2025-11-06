//Q11. Write a java program to calculate the sum of digits of a number.

import java.util.*;
class Digit
{   
  public int DigitNum(int no)
  
  {
  int rem;
  int sum = 0;
  
  while(no!=0)
  {
    rem = no%10;
    no = no/10;
	sum = sum + rem;
	  }
 
  return sum;
  }
}

class DigitSum
{
public static void main(String[]args)
  {
  System.out.println("Enter the number to get sum");
  Scanner sc = new Scanner(System.in);
  
  int n = sc.nextInt();
  Digit a = new Digit();
  
  int result = a.DigitNum(n);
  System.out.println("Sum of number is--->"+ result);

   }
}
/*
output:
Enter the number to get sum
12345
Sum of number is--->15   */