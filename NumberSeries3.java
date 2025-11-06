//Q54. Write a java program to display following series :
//           	1  2  4  7  11  16  22  29  37  46.

public class NumberSeries3
{
  public static void main(String[]args)
  {
     int no = 10;
	 
	 getNum a = new getNum();
	 a.NumSeries(no);
  }
}
class getNum
{
  public int NumSeries(int no)
  {   int sum = 1;
      for(int i=0 ;i< no ;i++)
	  {
	     sum = sum + i;
		 System.out.print(sum + " ");
	  
	  }
	  return no;
	
	}

}
/*
output:

1 2 4 7 11 16 22 29 37 46   */