/*Write a C program to input week number(1-7) and print day of week name using switch case. C program to find week day name using switch case. How to find day name of week using switch case in C programming.
Example
 Input
Input week number(1-7): 2
Output
Tuesday
 */

import java.util.*;
public class WeekChoice{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the week from 1-7");

int week = sc.nextInt();

switch(week){
 
 case 1 : 
   System.out.println("Monday");
 break;

  case 2 : 
   System.out.println("Tuesday");
 break;

   case 3 : 
   System.out.println("Wednesday");
 break;

   case 4 : 
   System.out.println("Thursday");
 break;

   case 5 : 
   System.out.println("Friday");
 break;

   case 6 : 
   System.out.println("Saturaday");
 break;

   case 7 : 
   System.out.println("Sunday");
 break;

 default :
   System.out.println("give input is invalid");
}
}
}
 











