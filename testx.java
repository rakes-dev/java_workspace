abstract class Employee
{
  int empId;
  String empName;
  Employee (int Id, String Name)
  {
    empId=Id;
    empName=Name;
  }

  public abstract void netSalary();

  public void display()
  {
  System.out.println("Employee Id: "+empId);
  System.out.println("Employee Name: "+empName);
  }
}

class Manager extends Employee
{
  int Salary;
  Manager (int Id, String Name)
  {
  super(Id, Name);
  }

  public void netSalary()
  {
    Salary=50000;
  }

  public void display()
  {
    super.display();
    System.out.println("Salary: "+Salary);
  }
}

class Cleark extends Employee
{
  int Salary;
  Cleark (int Id, String Name)
  {
  super(Id, Name);
  }

  public void netSalary()
  {
    Salary=25000;
  }

  public void display()
  {
    super.display();
    System.out.println("Salary: "+Salary);
  }
}

public class Testx{
  public static void main(String[] args)
  {
   Manager m1 = new Manager(82,"Akash");
   m1.netSalary();
   m1.display();

   Cleark c1 = new Cleark(41,"RAJ");
   c1.netSalary();
   c1.display();
 }
}
