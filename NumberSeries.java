//Q51. Write a java program to display following series :
//           	1  2  2  4  3  6  4  8  5  10  6  12


import java.util.*;
class NumberSeries
{
  public static void main(String[]args)
  {
    int no = 6;
	 getNum a = new getNum();
	  a.getSeries(no);
	 
  }
}
class getNum{

public int getSeries(int no)
{
    for(int i = 1;i<= no; i++)
	{
	   System.out.print(i + "  "+ i*2  + "  ");
	
	}
     return no;
   }
}
/*
output:
1  2  2  4  3  6  4  8  5  10  6  12
*/