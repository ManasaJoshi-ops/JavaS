package scannerdemo;

import java.util.Scanner;

public class ScannerClsDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student id:");
	int id=sc.nextInt();
	
	System.out.println("Enter student name:");
	String name=sc.next();
	
	System.out.println("Enter student Score:");
	double score=sc.nextDouble();
	
	System.out.println("List student details");
	System.out.println("id="+id);
	System.out.println("Name="+name);
	System.out.println("Score="+score);
	
}
}
