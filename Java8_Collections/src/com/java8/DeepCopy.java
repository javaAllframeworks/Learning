package com.java8;

class FirstObject  
{  
	// instance variable of the class ABC  
	int x = 30;  
}  
public class DeepCopy   
{     
	// main method  
	public static void main(String argvs[])   
	{  
		// creating an object of the class ABC  
		FirstObject obj1 = new FirstObject();  

		// it will copy the reference, not value  
		FirstObject obj2 = new FirstObject();  

		// updating the value to 6   
		// using the reference variable obj2  
		obj2.x = 6;  

		// printing the value of x using reference variable obj1   
		System.out.println("The value of x is: " + obj1.x);  
	}  
} 
