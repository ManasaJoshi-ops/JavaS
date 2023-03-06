package javabasic;

public class OperatorDemo {
	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		//arithmetic operator
		
		System.out.println("add = "+a+b);
		System.out.println("Sub = "+ (a-b));
		System.out.println("product = "+a*b);
		System.out.println("quotient = "+a/b);
		System.out.println("remainder = "+a%b);
		System.out.println("-------");
		
		//unary operator
		
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		System.out.println("-------");
		
		boolean isSelected=false;
		if(!isSelected) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		System.out.println("-------");
		
		//Relational operator >,<,<=,>=,==,!=
		//logical operators: &&, ||, 
		int age=16;
		boolean drivingClassesAttended=true;
		if(age>16 && drivingClassesAttended) {
			System.out.println("License approved");
		}else {
			System.out.println("Come again");
		}
		System.out.println("-------");
		
		//ternary operator: (condition)?yes:No
		
		int p=10;
		int q=8;
		int res=(p<q)?p:q;
		System.out.println(res);
		System.out.println("-------");
	}
}
