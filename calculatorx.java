import java.io.*;
import java.util.*;
import java.util.Scanner;
public class calculator{
    public static void main(String args []){
        char Operator;

        Double num1,num2,result;

        Scanner input =new Scanner(System.in);

        //System.out.print("Enter the valu of a: "+ num1);

        //System.out.print("Enter the valu of b: "+num2);

        //System.out.println("Choose an Operator: +, -, *, /");

        //Operator = input.nextDouble().charAt(0);

        System.out.println("Enter first number");

        num1=input.nextDouble();

        System.out.println("Enter second number");

        num2=input.nextDouble();

        System.out.println("Choose an Operator: +, -, *, /");

        Operator = input.next().charAt(0);

        switch (Operator)
        {
            case '+':

            result= num1 + num2;

            System.out.println(num1 + "+" + num2 + "=" + result);

            break;

            case '-' :

            result = num1 - num2;

            System.out.println(num1 + "-" + num2 + "=" + result);

            break;

            case '*' :

            result = num1 * num2;

            System.out.println(num1 + "*" + num2 + "=" + result);

            break;

            case '/' :

            result = num1 / num2;

            System.out.println(num1 + "/" + num2 + "=" + result);

            break;

            default:

            System.out.println("Invalid operator!");

            break;

        }

        input.close();

    }

}
