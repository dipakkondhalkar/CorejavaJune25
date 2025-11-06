//Q7. Write a java program to find the sum of all odd numbers between 1 to n.
import java.util.*;
   
class Od{

   public int OSum(int n){

       int i = 1;
       int sum = 0;
    
	     while(i<=n){

             if(i%2!=0){
             sum = sum + i;
                }
             i++;
            }
           return sum;
          }
        }


class OddSum{
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Od a = new Od();

        System.out.println("Enter the how number to find");
        int n = sc.nextInt();
        
        int result = a.OSum(n);
        System.out.println("Sum of the Even number "+ n + " is ---> "+ result);
    }
}
/*
output:

Enter the how number to find
100
Sum of the Even number 100 is ---> 2500  */