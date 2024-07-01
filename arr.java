import java.io.*;
import java.util.*;

class arr
{
  public static void main(String[] args)
  {


    int r,c;
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter Row: ");
    r=sc.nextInt();
    System.out.println("Enter Column: ");
    c=sc.nextInt();
    int arr[][]= new int[r][c];

    System.out.println("Enter data:");
    for(int i=0; i<r; i++)
    {
      for (int j=0; j<c; j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("Printing matrix:");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println(" ");
    }
  }
}
