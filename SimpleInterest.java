//. Write a java program to calculate the simple intrest

import java.util.*;
public class SimpleInterest{
public static void main(String[]args){
float  principle , rate , time, Simpleinterest;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the principle");
principle = sc.nextFloat();

System.out.println(" Enter the rate ");
rate = sc.nextFloat();

System.out.println("Enter the time");
time = sc.nextFloat();

Simpleinterest = (principle * rate * time )/100;

System.out.println(" The simple interest is =" + Simpleinterest );
}
}