package com.epam.CalculatorAmbuj;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		float a,b;
		char s;
		Scanner sr= new Scanner(System.in);
		System.out.println("Enter a number");
		a=sr.nextFloat();
		System.out.println("Enter another number");
		b=sr.nextFloat();
		System.out.println("Enter the operation");
		s=sr.next().charAt(0);
		mathsoperation ob=new mathsoperation();
		switch(s) {
		case '+':System.out.println("Sum="+ob.Add(a,b));break;
		case '-':System.out.println("Difference="+ob.Subtract(a,b));break;
		case '*':System.out.println("Product="+ob.Multiply(a,b));break;
		case '/':System.out.println("Result="+ob.Divide(a,b));break;
		default :throw new RuntimeException(s + "is unsupported");			
		}
	}

}
