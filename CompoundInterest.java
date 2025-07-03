/*Write a C program to input principle (amount), time and rate (P, T, R) and find Compound Interest. How to calculate compound interest in C programming. Logic to calculate compound interest in C program.
Example
 Input
Enter principle (amount): 1200
Enter time: 2
Enter rate: 5.4
Output
Compound Interest = 1333.099243
Compound Interest formula
Formula to calculate compound interest annually is given by.
Where,
 P is principle amount
 R is the rate and
 T is the time span*/

import java.util.*;
public class CompoundInterest{
public static void main(String[]args){

double principle, rate , time ;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the principle:");
principle = sc.nextDouble();

System.out.println("Enter the rate:");
rate = sc.nextDouble();

System.out.println("Enter the time:");
time = sc.nextDouble();

if(principle > 0 && rate > 0 && time > 0 ){

 double total = principle * Math.pow(1+ rate / 100,time);
 
 double CompoundInt = total - principle;

System.out.println("Compound Interest is = " + CompoundInt );

}
else {
System.out.println("given values are invalid");
}
}
}












