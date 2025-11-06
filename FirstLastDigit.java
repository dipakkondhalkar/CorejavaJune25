//Q18. Write a java program to find the first and last digit of a number.

import java.util.*;
class FirstLastDigit
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number ");
	 int no = sc.nextInt();
	 
	 getSum a = new getSum();
	  a.getFirstLast(no);
	 
  }
}
class getSum{

public int getFirstLast(int no)

{ int last = no%10;
  int first = no;
   while(first>=10)
   {
    
	first = first/10;
      
   }
   System.out.println("First number " + first);
   System.out.println("Last Number " + last);
    
   return no;
   } 
}
/*  
output:

Enter the number
1234
First number 1
Last Number 4    */