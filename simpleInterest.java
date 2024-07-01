import java.io.*;
import java.util.*;

public class simpleInterest
{
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter amount: ");
    int p = sc.nextInt();
    System.out.println("Enter rate of interest: ");
    int r = sc.nextInt();
    System.out.println("Enter time: ");
    int t = sc.nextInt();

    System.out.println("Simple Interest is : " + (p*r*t/100));
  }
}
