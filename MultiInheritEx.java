import java.io.*;

interface printable
{
  void print();
}
interface showable
{
  void show();
}
class MultiInheritEx implements printable,showable
{
  public void print()
  {
    System.out.println("Print");
  }
  public void show()
  {
    System.out.println("Show");
  }
  public static void main(String[] args)
  {
    MultiInheritEx t = new MultiInheritEx();
    t.print();
    t.show();
  }
}
