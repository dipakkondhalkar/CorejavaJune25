//Q54. Write a java program to display following series :
 //          	1  2  4  7  11  16  22  29  37  46.

public class NumberSeries5
{
  public static void main(String[]arg)
  {
    
	int no =7;
	getSeries x = new getSeries();
	x.getNum(no);
  }

}
class getSeries
{
  public int getNum(int no)
  {
    int sum = 1;
    for(int i=1;i<=10;i++)
	{
       System.out.print(sum + " "); 
	  sum = sum + i;
	 	
	}
	return no;
	}
  }
//	output:
	
//	1 2 4 7 11 16 22 29 37 46
	