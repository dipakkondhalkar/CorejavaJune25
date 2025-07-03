import java.util.*;
public class Monkey{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of monkeys");
		int A = sc.nextInt();
		
		System.out.println("Total banannas");
		int B = sc.nextInt();
		
		System.out.println("Total peanuts");
		int C = sc.nextInt();
		
		System.out.println("number of bananas eaten");
		int D = sc.nextInt();
		
		System.out.println("number of peanuts eaten");
		int E = sc.nextInt();
		
		int BananasEaten = D/A ;
		int PeanutsEaten = C/E ;
		
		int TotalMonkeyEaten = D+E;
		
	    int leftBananas = B % D;
        int leftPeanuts = C % E;
	
	if ( (leftBananas > 0 || leftPeanuts> 0 ) && TotalMonkeyEaten < A ){
		
		TotalMonkeyEaten = TotalMonkeyEaten + 1;
	}
	   int monkeyleft = A - TotalMonkeyEaten ;
	   
	   System.out.println("The total monkey has left " + monkeyleft);
	   
	}
}

		