//Q9. Write a java program to enter two angles of a triangle and find the third angle. 

import java.util.*;
public class TRIANGLE{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the first angle ");
int firstangle = sc.nextInt();

System.out.println("Enter the second angle ");
int secondangle = sc.nextInt();

int ThirdAngle = 180 - (firstangle + secondangle );

System.out.println(" Third Angle is " + ThirdAngle );

}
}