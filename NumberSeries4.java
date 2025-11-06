//Q55. Write a java program to display following series :
//           	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40
 
public class NumberSeries4
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
     int a = 5;
     int b = 3;
    for(int i= 1 ;i<=no;i++)
	{
	   System.out.print(a + " " + b + " ");
	   a = a + 5;
	   b = b + 3;
	   
	
	}
     System.out.print(a);
	 return no;
  
  }
}
/*
output:
5 3 10 6 15 9 20 12 25 15 30 18 35 21 40   */