/*. Calculate the average of all elements in an array.
Explanation: First calculate the sum, then divide by array length. */


import java.util.*;
public class AverageArray1{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int []a = new int[5];
  
	 System.out.println("Enter the elements of array:");
        for (int i = 0; i <a.length; i++)
			{
            a[i] = sc.nextInt();     // Store element
		    }
			int result = getAverage(a);
			System.out.println("Average of all elements in array is" + result);
    }

   
   public static int getAverage(int a[])
   
   {
	   int sum = 0;
       float avg;
     for(int i=0;i<a.length;i++)
	 {
		 sum = sum + a[i];
		 
	 }
	  avg = sum/a.length;
	  return (int)avg;
   }
  }
/*
output:
Enter the elements of array:
1
2
3
4
5
Average of all elements in array is3
*/