/*Write a java program to Check Number Is Spy Number or Not.
Example :
A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     Input : 1412
     Output : Spy Number 

Explanation :
sum = (1 + 4 + 1 + 2) = 8
product = (1 * 4 * 1 * 2) = 8
since, sum == product == 8
*/

import java.util.*;
public class Spy{
public static void main(String[]args){

Scanner sc = new Scanner (System.in);
System.out.println(" Enter the number ");
int no = sc.nextInt();

int rem , r , sum=0 , product =1 , temp = no;
while(no>0){
	
rem = no % 10 ;
sum = sum + rem ;
no = no /10 ;
product = product * rem ;

}
if(){
System.out.println(" is spy ");
}
else{
System.out.println(" is not spy");
}
}
}

