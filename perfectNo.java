import java.util.*;

class perfectNo
{
  public static void main(String[] args)
  {
     int num,i,res=0;//declare variables and initialize result to 0
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a number to check Perfect or Not:");
     num = sc.nextInt();
     for(i=1;i<=num;i++)
     {
       if(num%i==0)
       res=res+i;
     }
     if(res==2*num) //checking the sum of factors==2*number
       System.out.println(num + " is a Perfect number");
     else
       System.out.println(num + " is not a Perfect number");
  }
}
