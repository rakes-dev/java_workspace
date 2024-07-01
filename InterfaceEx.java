import java.io.*;

interface A
{
  final int a=10;
  void display();
}

class InterfaceEx implements A
{
  public void display()
  {
    System.out.println("Hello");
  }
  public static void main(String[] args) {
    InterfaceEx i = new InterfaceEx();
    i.display();
    System.out.println(a);
  }
}
