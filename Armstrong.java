import java.io.*;
import java.util.Scanner;

class Armstrong
{
  public static void main(String[] args)
  {
    int num, num2, remainder, result = 0;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter any three-digit integer: ");
    num = obj.nextInt();//scanf("%d", &num);
    num2 = num;

    while (num2 != 0)
	{
       remainder = num2 % 10;
       result += remainder * remainder * remainder;
       // removing last digit from the orignal number
       num2 /= 10;
    }

    if (result == num)
        System.out.println(num + " is an Armstrong number.");
    else
        System.out.println(num + " is not an Armstrong number." );
  }
}
