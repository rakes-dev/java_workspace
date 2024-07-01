import java.io.*;
import java.util.*;

class prime{
  public static void main(String args[]){
  	int num,i,flag=0;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a No: ");
    num = sc.nextInt();
  	if(num==0 || num==1)
  	  flag=1;
  	for(i=2;i<=num;++i){
  		if(num%2==0){
  			flag=1;
  			break;
  		}
  	}
  	if (flag == 0)
  		System.out.println(num + " is a prime number.");
  	else
  		System.out.println(num + " is not a prime number.");
  }
}
