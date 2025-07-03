/*An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :
Input :
200  -> Value of V
540   -> Value of W
Output :
TW =130 FW=70 */

import java.util.*;
public class Automobile{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of vehicle");
int v = sc.nextInt();

System.out.println(" Enter the number of wheel");
int w = sc.nextInt();

int TW ,FW ;

if(v>= 0 && w >=0 )
{
 TW = (w -2 * v ) ;
 System.out.println("Total two wheeler :" + TW );
  v = v - TW ;
  System.out.println(" Total four wheeler :"+ v);
  }
  else {
  System.out.println(" INVALID INPUT");
  }
  }
  }