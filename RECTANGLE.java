//Q 4. Write a java program to enter length and breadth of a rectangle and find its area.
//Formula - area= length * breadth;

import java.util.*;
public class RECTANGLE{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("enter the length ");
int length = sc.nextInt();

System.out.println("enter the breadht");
int breadth = sc.nextInt();

int area = length * breadth ;

System.out.println("Area of the Rectangle is = " + area);
}
}

