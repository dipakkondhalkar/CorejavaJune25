//. Write a java program swap two number using third variable.

import java.util.*;
public class SWAP{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println(" Before swapping");
System.out.println(" Enter first number A");
int num1 = sc.nextInt();

System.out.println(" Enter second number B");
int num2 = sc.nextInt();

int temp = num1 ;
 num1 = num2 ;
  num2 = temp;
  
  System.out.println("After swapping number ");
   System.out.println(" A is " + num1 );
    System.out.println(" B is " + num2);
	
	}
	}