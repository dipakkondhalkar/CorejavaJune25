//Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
//Formula :- fah = (cel * 9 / 5) + 32;

import java.util.*;
public class Celsius {
public static void main( String[]args ){

Scanner sc = new Scanner (System.in);
System.out.println(" Enter the Celsius ");
double Celsius = sc.nextDouble();

double Fah = ( Celsius *  9/5 ) + 32  ;

System.out.println(" Fahrenheit is  " + Fah);

}
}