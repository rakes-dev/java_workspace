/*14. Write a program in java with class Employee and do the following operations on it
1) Create two constructor default and with Object as parameter to initialize class
variables.
2) Create a function calculate which calculates the pf and allownces on the salary of
employee
and return the all values as an object
3) Print all the employee aobject associated values returned from calculate functions */

import java.io.*;
import java.lang.*;

class Employee
{
    String name;
    int ID;
    double basic_salary;

    Employee(){}

    Employee(String n, int i, double s)
    {
       name=n;
       ID=i;
       basic_salary=s;
       /*System.out.println("Name: "+name);
       System.out.println("Employee ID: "+ID);
       System.out.println("Basic pay: "+basic_salary);*/
    }
//copy constructor
Employee(Employee e)
    {
       name=e.name;
       ID=e.ID;
       basic_salary=e.basic_salary;
       System.out.println("Name: "+name);
       System.out.println("Employee ID: "+ID);
       System.out.println("Basic pay: "+basic_salary);

    }

    double pf_allowance(double basic_salary)
    {
        double pf=basic_salary*2/100;
        double allowance=basic_salary*10/100;
        double s=basic_salary+allowance-pf;
        return s;
    }


    public static void main(String[] args)
    {
        Employee e=new Employee("Abc",10,20000);
//Call copy constructor
       	Employee e1=new Employee(e);

        System.out.println("Gross pay is Rs."+e1.pf_allowance(20000));

    }
}
