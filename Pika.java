import java.io.*;
import java.util.Scanner;


abstract class Employee {
        void Name(String n)
        {
            System.out.println("Name: "+n);
        }
        void ID(long a)
        {
            System.out.println("ID: "+a);
        }
        abstract float netsalary();
        abstract void display();
}

class Manager extends Employee{

        float netsalary()
        {
            float salary;
            Scanner s = new Scanner(System.in);
            salary=s.nextFloat();
            return salary;
        }

        void display()
        {
            System.out.println("Manager: ");
            Name("Abc");
            ID(1);
            System.out.println("Net Salary: "+netsalary());
        }

}

class Clerk extends Employee{
    float netsalary()
        {
            float salary;
            Scanner s=new Scanner(System.in);
            salary=s.nextFloat();
            return salary;
        }

        void display()
        {
            System.out.println("Clerk: ");
            Name("Efg");
            ID(2);
            System.out.println("Net Salary: "+netsalary());
        }
}

public class Pika{
    public static void main(String[] args)
    {
        Employee E1=new Manager();
        Employee E2=new Clerk();
        E1.netsalary();
        E1.display();
        E2.netsalary();
        E2.display();
    }
}
