package javabasic;

public class LoopsDemo {
public static void main(String[] args) {
	//hello world 3x
	
	for(int i=1;i<=3;i++) {
		System.out.println("Hello World");
	}
	System.out.println("-------");
	
	//1 to 10
	for(int i=1;i<=10;i++) {
		System.out.println(i);
	}System.out.println("-------");
	
	//even numbers from 1 to 10
	
	for(int i=1;i<=10;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	System.out.println("-------");
	
	//10 to 1
	for(int i=10;i>0;i--) {
		System.out.println(i);
	}
	System.out.println("-------");
	
	//sum of odd numbers
	
	int sum=0;
	for(int i=1;i<=10;i+=2) {
		sum+=i;
	}
	System.out.println(sum);
	System.out.println("-------");
	
	
	//break 
	for(int i=1;i<=10;i++) {
		if(i>5) {
			break;
		}
		System.out.println(i);
		
	}
	System.out.println("-------");
	
	//continue
	
	for(int i=1;i<=10;i++) {
		if(i==5) {
			continue;
		}
		System.out.println(i);
	}
	System.out.println("-------");
	
	//while loop
	
	int i=1;
	while(i<6) {
		System.out.println(i);
		i++;
	}
	
	
	
}
}
