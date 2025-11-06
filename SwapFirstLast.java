//Q20. Write a java program to swap first and last digits of a number.

import java.util.*;
class SwapFirstlast
{
 public static void main(String[]args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number");
   int no = sc.nextInt();
   
   Swap a = new Swap();
   a.SwapNum(no);
   
 }

}
class Swap
{

  public int SwapNum(int no){
    int temp = no;
    int last = no%10;
	int first = no;
	while(first>=10)
	{
	 first = first/10;

  }
     temp = first;
	 first = last;
	 last = temp;
	 System.out.println("Number After swap"+  temp);
	 return no;
}
}