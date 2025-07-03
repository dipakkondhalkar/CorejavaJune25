//Q 5. Write a java program to enter radius of a circle and find its diameter,area and circumference.
//Formula :-
//diameter=2 * radius;
//circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius;

import java.util.*;
public class CIRCLE{
public static void main(String[]args){

int radius;
double pi = 3.14;

Scanner sc = new Scanner(System.in);

System.out.println("Enter the value of radius");
radius =sc.nextInt();

int diameter = 2 * radius ;
System.out.println(" The diameter is = " + diameter );

double circumference = 2 * pi * radius;
System.out.println("Circumference is = " + circumference );

double area = pi * radius * radius ;
System.out.println(" Area is " + areas);
}
}

