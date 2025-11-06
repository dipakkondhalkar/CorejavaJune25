//Q30. Write a java program to display 1 to nth Prime Number.

import java.util.*;
public class PrimeNum
{
  public static void main(String[]args)
  {  Scanner sc = new Scanner(System.in);
     System.out.println("<---Enter the number--->");
     int no = sc.nextInt();
    getPrime a = new getPrime();
	a.PrimeNum(no);
  
  }  
}

class getPrime
{ 
  public int PrimeNum(int no)
  {  boolean flag = true;
      
	   for(int i=2;i<no ;i++)
	   {
	      if(no%i==0)
		  {
			 flag = false;
		      break;
			
		  }
	   }
	   if(flag)
	   {
		   System.out.println("Number is prime number");
	   }
	   else
	   {
		   System.out.println("Number is not prime number");
	   }
     return no; 
  }
 
}
output:
<---Enter the number--->
5
Number is prime number