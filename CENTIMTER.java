//. Write a java program to enter length in centimeter and convert into meter and kilometer.

import java.util.*;
public class CENTIMTER{
public static void main(String[]args){

int cm , meter, km;
Scanner sc = new Scanner (System.in);
System.out.println(" Enter the centimeter :");
cm =  sc.nextInt();

meter = cm / 100;
km = cm / 1000;

System.out.println(" Meter is = " + meter );
System.out.println(" Kilometer is  = " + km );

}
}
 // Enter the centimeter :
// 1000
 // Meter is = 10
 // Kilometer is  = 1