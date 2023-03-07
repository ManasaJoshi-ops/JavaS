package scannerdemo;

import java.util.Scanner;

public class AddTillNotNumber {public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number (char to exit)");

	while(sc.hasNextInt()) {
	   int num=sc.nextInt();
	   sum+=num;
	   System.out.println("Enter a number (char to exit)");

	}
	System.out.println(sum);
	
}
}
