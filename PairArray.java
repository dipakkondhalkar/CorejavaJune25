/*Q4. Print all pairs of elements whose sum equals a target number.
Explanation: Use nested loops and check if arr[i] + arr[j] == sum. */

import java.util.*;
public class PairArray
{
     public static void main(String[]args)
 {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the elements in array");
      int []a  = new int[5];
      for(int i=0;i<a.length;i++)
   {
     a[i] = sc.nextInt();
   }
   System.out.println("Enter the target number");
   int target = sc.nextInt();
   
   getTarget(a,target);
 }

public static void getTarget(int a[],int Target)
{
    for(int i=0;i<a.length;i++)
	{  int sum = 0;
	  for(int j=i+1;j<a.length;j++)
	  {
	     if(a[i] + a[j] == Target)
		 {
		 
		   System.out.println("("+a[i] + "," + a[j]+")" + Target);
		 }
	  }
	}
  } 
}
/*
output:
Enter the elements in array
1
2
3
4
5
Enter the target number
3
(1,2)3   */