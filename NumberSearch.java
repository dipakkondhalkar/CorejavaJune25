//Number present or not
import java.util.*;
public class NumberSearch
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter elements in :");
	 int no = sc.nextInt();
	 
	 System.out.println("Enter number to check is present or not : ");
	 int skey = sc.nextInt();
	 int rem;
	 boolean flag = false;
	 while(no!=0)
	 {  
	     rem = no%10;
		 no = no/10;
		 if(rem==skey)
		 { 
	       flag = true;
		   break;
		 }
	 }
		if(flag){
		   System.out.println("Number found ");
		 }
		 else
		 {
			 System.out.println("Number not found");
		 }
	 }
  }
  Enter elements in :
2343434
Enter number to check is present or not :
3
Number found
