import java.util.*;

class Fibonacchi
{
  public static void main(String[] args)
  {
    int i,n1=0,n2=1,n3,num;
    Scanner sc = new Scanner(System.in);
	  System.out.println("\nEnter a No. ");
	  num = sc.nextInt();
	  System.out.println("\nFibonacci Series:");
	  System.out.println(n1 +"\n"+ n2);

	  for(i=2;i<=num;i++)
	  {
	    n3 = n1+n2;
	    System.out.println("\n"+n3);
	    n1=n2;
	    n2=n3;
	  }
  }
}
