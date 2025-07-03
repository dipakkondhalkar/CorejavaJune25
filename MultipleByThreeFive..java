//max number between two

import java.util.*;
public class MultipleByThreeFive{
public static void main(String[]args){

int a ,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the values");
a = sc.nextInt();
b = sc.nextInt();

String result = ( a % 3 == 0 && b % 5 == 0 ) ?  " they are multiple" : " not multiple";

System.out.println(result);
}
}
