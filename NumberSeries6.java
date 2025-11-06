// Q52. Write a java program to display following series :
//           	2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1


public class NumberSeries6
{
  public static void main(String[]arg)
  {
    
	int no = 10 ;
	getSeries x = new getSeries();
	x.getNum(no);
  }

}
class getSeries
{
  public int getNum(int no)
  {
    int cube = 9;
    for(int i=2;i<=18;i+=2)
	{
	   int cube1 = cube * cube * cube;
       System.out.print( i + " "+ cube1 +" "); 
	   cube--;
	 	
	}
	return no;
	}
  }
 // output:
//  2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1