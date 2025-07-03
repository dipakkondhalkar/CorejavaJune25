//Write a java program swap two number without using third variable. 

import java.util.*;

public class SWAPwithoutVAR{
public static void main(String[]args){

Scanner sc = new Scanner (System.in);
System.out.println(" Enter the TWO numbers :");
int A = sc.nextInt();
int B = sc.nextInt();

A = A + B;
B = A - B ;
A = A - B;

 System.out.println(" After swapping A " + A);
 System.out.println(" After swapping B " +B);
 }
 }
  // Enter the TWO numbers :
// 5
// 10
 // After swapping A 10
 // After swapping B 5
