//Q7. Write a java program to find the sum of all even numbers between 1 to n.
import java.util.*;
   
class Ev{

   public int ESum(int n){

       int i = 1;
       int sum = 0;
    
	     while(i<=n){

             if(i%2==0){
             sum = sum + i;
                }
             i++;
            }
           return sum;
          }
        }


class EvenSum{
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Ev a = new Ev();

        System.out.println("Enter the how number to find");
        int n = sc.nextInt();

        int result = a.ESum(n);
        System.out.println("Sum of the Even number "+ n + " is ---> "+ result);
    }
}
/*
output:

Enter the how number to find
100
Sum of the Even number 100 is ---> 2500   */