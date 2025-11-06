/*Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number. */


import java.util.*;
public class HappyNumber
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int no = sc.nextInt();
	
	getHappy a = new getHappy();
	a.getHappyNum(no);
  }

} 

class getHappy{

  public int getHappyNum(int no){
int sum= 0;
boolean flag = false;

while(no>9){
	sum=0;
	while(no!=0){
		int rem = no%10;//To seperate last number.
	    sum = sum + rem*rem;//to calculate square.
		no = no/10;
	}
	if(sum==1){
		flag = true;
		break;
	}
	no = sum ;
}
if(flag == true){
	
	System.out.println("Number is Happy");
}
else{
	System.out.println(" Number is not Happy");
}

 return no;
}
}
/*
output:
Enter the number
19
Number is Happy  */