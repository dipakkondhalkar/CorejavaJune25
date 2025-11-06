//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;
class rev{

public int reverse(int no){
System.out.println("All natural number reverse");
  while(no!=0){
  
	System.out.println(no);
	no--;
  }
  return no;
 }
}
class Reverse{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   rev a = new rev();
   System.out.println("Enter the number");
  int no = sc.nextInt();
   a.reverse(no);
  
}
}
/*
output:
Enter the number
10
All natural number reverse
10
9
8
7
6
5
4
3
2
1
*/
