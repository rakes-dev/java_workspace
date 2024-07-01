import java.util.*;

class NumToBinNhex
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Integer to convert into Binary & Hexadecimal");

    int bin = sc.nextInt();
    int hex = bin;

    System.out.println("Binary value is: " + Integer.toBinaryString(bin));
    // Using toHexString() method for getting Decimal and
    // Storing the hexaDecNum in a string
    String hexa = Integer.toHexString(hex);
    System.out.println("Hex value is: " + hexa);
  }
}
