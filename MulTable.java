//Q9. Write a java program to print a multiplication table of any number.

import java.util.*;
class Mul
{
public int MTable(int n)

  {
  int i=1;
  System.out.println("Table is :");
  while(i<=10)
  {
	  System.out.println(n*i);  
	  ++i;
  }  
  
  return n*i;
}
}

class MulTable
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
	     Mul a = new Mul();
		 
		System.out.println("Enter the Number to find table");
	   int n = sc.nextInt();
		
		 a.MTable(n);
		
		//System.out.println("Table--> " + result);
				
	}	
}
/*
output:

Enter the Number to find table
5
Table is :
5
10
15
20
25
30
35
40
45
50  */