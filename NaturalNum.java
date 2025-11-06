class Nat
{
public int Natural(int no)
{
  int i = 0;
  while(i<no){
  
  i++;
  System.out.println(i);
  }
    return i;
  }
  }
  class Ares
{
  public static void main (String x[])
  {
   Nat a = new Nat();
   
   a.Natural(100);
 
   }
  }