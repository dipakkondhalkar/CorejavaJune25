public class CMDAPP
{
  public static void main(String[]x)
  {
    //System.out.println("Enter two values :");
	int a = Integer.parseInt(x[0]);
	int b = Integer.parseInt(x[1]);
	
	System.out.println("Addition is:"+(a+b));
	System.out.println("Substection is:"+ (a-b));
	System.out.println("Division is : "+ (a/b));
  }
}