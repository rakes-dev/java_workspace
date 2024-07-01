import java.io.*;
import java.util.*;


class TwoDArray
{

  public static void main (String[]args)
  {
        Scanner s=new Scanner(System.in);
        int arr[][]=new int[10][10];
        int r,c;
        System.out.print("Enter no. of rows: ");
        r=s.nextInt();
        System.out.print("\nEnter no. of Columns: ");
        c=s.nextInt();
        int i,j;
        System.out.println("\nEnter array elements: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
	System.out.println("\n Original Matrix: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        //implementation of 2D Array
	System.out.println("Transpose of the matrix");
	for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }
        
  }
}