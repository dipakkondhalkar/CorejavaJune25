//Q13. Write a java program to enter a number and print its reverse.
import java.util.*;
class Num
{
  public int NumR(int no)
  {
	int rev = 0;
  while(no!=0)
  {
    int rem = no%10;
	  rev = rev * 10 + rem;
	  no = no/10;
  }
  return rev; 
  }
}

class ReverseNum
{
   public static void main(String[]args)
   {
   
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to reverse");
	 int xyz = sc.nextInt();
	 Num a = new Num();
	 int reverse = a.NumR(xyz);
	 
	System.out.println("The reverse number is "+ reverse);  
   
   }

}/*

output:
Enter the number to reverse
1234
The reverse number is 4321  */