//Write a java program to enter marks of five subjects and calculate total marks and percentage.

import java.util.*;
public class SubjectPercentage{
public static void main(String[]args){

Scanner sc = new Scanner( System.in);
int A ,B, C,D,E , Total , percentage;
System.out.println(" Enter the marks ");
A = sc.nextInt();
B = sc.nextInt();
C = sc.nextInt();
D = sc.nextInt();
E = sc.nextInt();

System.out.println(" Total number of marks ");
 Total = A + B + C + D + E;
 System.out.println(Total);
 
 percentage = ( Total* 100/ 500 );
 
 System.out.println(" Percentage is " + percentage);
 }
 }