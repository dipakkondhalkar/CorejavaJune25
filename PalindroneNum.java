//Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;
class Palin
{
   public int Palindrome(int no)
   {  
      int rem,num = 0;
	  int temp = no;
      while(no!=0){
	  
	  rem = no%10;
	  no = no/10;
	  num = num*10+ rem ;
	  
	  }
	  
	  if(temp==num)
	  {
	   System.out.println("Number is palindrome");
	  }
	  else{
		  
		  System.out.println("Number is not palindrome");
	  }
	  return no;   
   }

}

class PalindroneNum
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number ");
     int n = sc.nextInt();
     Palin a = new Palin();
     a.Palindrome(n);
      // System.out.println("Palindrome is " + result); 
  
  }

}
/*

output:
Enter the number
121
Number is palindrome   */