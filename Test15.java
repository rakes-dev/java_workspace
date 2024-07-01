import java.io.*;

class Person
{
  double salary;
  String name;
}
class Politician extends Person
{
  Politician(String n, double s)
  {
    name = n;
    salary = s;
  }
    void display()
    {
      System.out.println("Politician: "+name);
      System.out.println("Salary :"+salary);
    }
}
class Sportsman extends Person
{
  Sportsman(String n, double s)
  {
    name = n;
    salary = s;
  }
    void display()
    {
      System.out.println("Sportsman: "+name);
      System.out.print("Salary: "+ salary);
    }
}
class Test15
{
  public static void main(String[] args)
    {
      Politician p = new Politician("MAMTA",150000);
      Sportsman s = new Sportsman("VIRAT",200000);
      p.display();
      s.display();
    }
}
