//Q3. Create a new array where each element is the square of the original.
//Explanation: newArr[i] = arr[i] * arr[i]; in loop.

import java.util.*;
public class SquareArray
{
  public static void main(String[]args)
  {
	   Scanner sc = new Scanner(System.in);
	   int []a =new int[5];
	   System.out.println("Enter elements in array");
	   for(int i =0 ;i<a.length;i++)
	   {
		   a[i] = sc.nextInt();
		   
	   }
	 
	 // System.out.println("Square of given array is "+ a);
	  getSquare(a);
  }
   public static void getSquare(int a[])
   {    System.out.println("Square of elements is");
	   for(int i=0;i<a.length;i++)
	   {
		   
		   a[i] =a[i]* a[i];
		 System.out.print(a[i] + " ");
		   
	   }
   }
}
/*
output:
Enter elements in array
1
2
3
4
5
Square of elements is
1 4 9 16 25   */