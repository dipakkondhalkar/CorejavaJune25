// temperature in Fahrenheit and convert to Celsius.

import java.util.*;
public class Fahrenheit{
public static void main(String[]args){

Scanner sc = new Scanner( System.in);
System.out.println(" Enter the Fahrenheit");
double Fahrenheit =sc.nextDouble();

double celcius = (5.0/9) * ( Fahrenheit - 32 );

System.out.println(" The celcius is " + celcius );

}
}

 // Enter the Fahrenheit
// 98.0
 // The celcius is 36.66666666666667