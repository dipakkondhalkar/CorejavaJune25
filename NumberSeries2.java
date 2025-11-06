//Q53. Write a java program to display following series :
 //          	1  4  9  16  25  36  49  64  81  100

public class NumberSeries2
{
  public static void main(String[]args)
  {  
     int no = 10;
	 
	 getSeries a = new getSeries();
	 a.getSeriesNum(no);
	 
    
  }
}
class getSeries
{
  public int getSeriesNum(int no )
  {
     for(int i=1 ; i<=no;i++)
	 {
	   System.out.print(i*i + " ");
	 }
	 return no;
  }
}
/*
output:
1 4 9 16 25 36 49 64 81 100  */