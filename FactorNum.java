//Q17. Write a java program to find all factors of a number.

import java.util.*;
class Fact
{
  public int Factor(int num)
  {
    System.out.println("Factors are");
   for(int i= 1; i<num ;i++)
   {
      if(num%i == 0)
	  {
	  
	 System.out.printf(" %d ",i);
	  
	 }
   }
   return num;
   }
  }
  
  class FactorNum
  {
  
   public static void main(String[]args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = sc.nextInt();
     Fact a = new Fact();
     a.Factor(n);
    //System.out.println("Factor of given num is " + result); 	 
   }
  
  }
  /*
 output: 
 Enter the number
12
Factors are
 1  2  3  4  6   */