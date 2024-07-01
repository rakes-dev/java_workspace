//import java.io.*;
import java.util.*;

class array{
  public static void main(String[] args) {
    //int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter column");
    int c = sc.nextInt();
    System.out.println("Enter row");
    int r = sc.nextInt();

    for(int i=0;i<c;i++)
    {
      System.out.print(i + " ");
      for(int j=0;j<r;j++)
      {
        System.out.print(j + " ");
      }
      System.out.println(" ");
    }
  }
}
