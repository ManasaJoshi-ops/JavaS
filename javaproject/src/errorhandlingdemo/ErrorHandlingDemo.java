package errorhandlingdemo;

import java.util.Scanner;

public class ErrorHandlingDemo {
public static void main(String[] args) {
	divideByZero();
//	stringParserDemo();
//	nullPointerDemo();
}
private static void stringParserDemo() {
	try {
	String s="hello";
	int i=Integer.parseInt(s);
	System.out.println(i);}
	catch(NumberFormatException e){
		System.out.println("Exception occured.."+e.getMessage()+e.toString());
	}
}

private static void nullPointerDemo() {
	try {
		String s1=null;
		System.out.println(s1.length());
	}catch(NullPointerException e) {
		System.out.println("Exception occured"+e.getMessage());
	}
}
private static void divideByZero() {
	int a,b;
	float c,d;
	System.out.println("Enter two numbers :");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	try {
	c=a/b;
	d=a%b;
	System.out.println(a+"/"+b+"="+c+" Remainder = "+d);
	
	}catch(ArithmeticException e) {
		System.out.println("Exception occured.."+e.getMessage());
	}finally {
		System.out.println("End of Calculator");
	}
}
}

