//Q2. Print elements that are greater than a given number x.
//Explanation: Use if (arr[i] > x) inside the loop.

import java.util.*;
public class GreaterArray
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	int []a  = new int[5];
	// int x = 3;
	  System.out.println("Enter the elements in array");
	  for(int i=0;i<a.length;i++)
	  {
		  a[i] = sc.nextInt();
	  }
	  System.out.println("Enter the number from greater elements to print");
	  int x =sc.nextInt();
	  System.out.print("Greater element are\n "+ x);
	  getGreater(a,x);
  }
   public static void getGreater(int a[],int x)
   {
	   
	   for(int i=0; i<a.length;i++)
       {
		   if(a[i]>x)
		   {
			   System.out.print(" " +a[i]+ " ");
		   }
		   
	   }
   }
}
/*
output;
Enter the elements in array
1
2
3
4
5
Enter the number from greater elements to print
2
Greater element are
 2 3  4  5   */