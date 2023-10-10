package com.java8.basicExamples;

import java.util.Scanner;

public class Armstrong {

	  public static void main(String ...a){
		    int i=0,n,result=0,number1,temp;
		    Scanner sc= new Scanner(System.in);
		    System.out.print("Enter number- ");  
		    int number= sc.nextInt();  
		    number1=number;
		    temp=number;
		    while(number!=0){
		        number=number/10;
		        i++;
		        }
		    while(number1!=0){
		        n=number1%10;
		        result=result+(int)Math.pow(n,i);
		        number1=number1/10;
		        }
		    if(temp==result)
		        System.out.println("number is armstrong");
		    else
		        System.out.println("not a armstrong");
		    }

}
