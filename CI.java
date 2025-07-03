//Write a java program to calculate the compound intrest.
import java.util.*;
public class CI{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println(" Enter the principle ");
double  principle = sc.nextDouble();

System.out.println(" Enter the rate ");
double rate = sc.nextDouble();

System.out.println(" Enter the time ");
double time = sc.nextDouble();

double Amount = principle * Math.pow((1 + rate /100), time);

double CompoundInterest = Amount - principle;

System.out.println(" Compound Interest is = " + CompoundInterest);
}
}
