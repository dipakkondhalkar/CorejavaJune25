/*Write a C program to input principle, time and rate (P, T, R) from user and find Simple Interest. How to calculate simple interest in C programming. Logic to find simple interest in C program.
 
Example
 Input
Enter principle: 1200
Enter time: 2
Enter rate: 5.4*/

import java.util.*;
public class SimpleInterest1{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter value principle");
float principle = sc.nextFloat();

System.out.println("Enter value time");
float time = sc.nextFloat();

System.out.println("Enter value rate");
float rate = sc.nextFloat();

if(principle > 0 && time > 0 && rate > 0){

float SimpleInterest =  (principle * rate * time )/100;
 System.out.println("The simple intereset is =" + SimpleInterest);

 }
else{
System.out.println("Invalid SimpleInterest");
}
}
}








