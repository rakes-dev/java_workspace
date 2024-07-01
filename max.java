import java.io.*;
import java.util.*;

class max{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any two numbers to find maximum & minimum");

    System.out.println("Enter any three numbers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    if ((num1>num2)&&(num1>num3))
      System.out.println(num1 + " is Maximum");

    else if ((num2>num1)&&(num2>num3))
      System.out.println(num2 + " is Maximum");

    else if ((num3>num1)&&(num3>num2))
      System.out.println(num3 + " is Maximum");

    else
    System.out.println("All numbers are same");
  }
}
