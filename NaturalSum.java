
//Q6. Write a java program to find the sum of all natural numbers between 1 to n.
import java.util.*;
class Sum{
public int SumNat(int n){

int i=1;
int sum = 0;
while(i<=n){
 
  sum  = sum + i;
  
  i++;
   }
    return sum;
}
}
class NaturalSum{
public static void main(String[]args){
//Scanner sc = new Scanner(System.in);

Sum a = new Sum();
int result = a.SumNat(100);
System.out.println("The Sum of all Natural Number is---> " + result );
   }

}
/*
output:
The Sum of all Natural Number is---> 5050  */