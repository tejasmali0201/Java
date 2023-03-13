import java.util.*;

class Logicoper
{
	public static void main(String[] args)
	{
	 int a;
	 int b;
	 int c;
	 Scanner s = new Scanner(System.in);
 	 System.out.println("Enter the Number and check the greater one:");
	 a=s.nextInt();
	 b=s.nextInt();
	 c=s.nextInt();
	 if(a>b && a>c)
	  {
		System.out.println("a is greater");
	  }
   	  else if(b>a && b>c)
	  {
		System.out.println("b is greater");
	  }
	  else
	  {
	      System.out.println("c is greater");
	  }
	}
}