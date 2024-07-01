import java.io.*;
import java.util.*;

class average{
  //Average of values
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int count=0,i=0;
    double sum=0.0;

    System.out.println("Enter number to average");
    while(sc.hasNext()){
      if(sc.hasNextDouble()){
        sum=sum + sc.nextDouble();
        count = ++i;
      }
      else{
      String str=sc.next();
      if(str.equals("done"))
        break;
      else
        System.out.println("Error");
      }
    }
      System.out.println("Average="+sum/count);
  }
}
