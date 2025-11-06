//Q19. Write a java program to find the sum of the first and last digit of a number

import java.util.*;
class SumFirstLast
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
   
   int result  = first + last;
   System.out.printf("Sum of first %d and Last %d number = %d " ,first ,last ,result);

   return no;
   }
}
/*
output;
Enter the number
123456
Sum of first 1 and Last 6 number = 7   */