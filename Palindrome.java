import java.util.*;

class Palindrome
{
  public static void main(String[] args)
  {
    int num,rev=0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to check Palindrome:");
    num = sc.nextInt();

    int temp=num;
    while(temp>0)
    {
      rev = rev*10 + temp%10;
      temp /= 10;
    }
    if(num==rev)
      System.out.println("The number is Palindrome");
    else
      System.out.println("The number is not Palindrome");
  }
}
