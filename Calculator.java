import java.io.*;
import java.util.*;

public class Calculator
{
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter any operator: +, -, /, *.");
	    char OP = sc.next().charAt(0);

	    System.out.println("Enter first number: ");
	    int num1 = sc.nextInt();
	    System.out.println("Enter Second number: ");
	    int num2 = sc.nextInt();

	    switch(OP)
	    {
	        case '+' :
	            System.out.println("Answer:" + (num1+num2));
	            break;
	        case '-' :
	            System.out.println("Answer:" + (num1-num2));
	            break;
          case '/' :
                System.out.println("Answer:" + (num1/num2));
                break;
	        case '*' :
	            System.out.println("Answer:" + (num1*num2));
	            break;
	        default :
	            System.out.println("Enter valid option");
	    }

	}
}
