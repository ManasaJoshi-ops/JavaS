package javabasic;

public class SwitchDemo {
public static void main(String[] args) {
	
	int a=10;
	int b=2;
	System.out.println("Enter your choice from the below menu:");
	System.out.println("--------------------------------------");
	System.out.println("1. Addition");
	System.out.println("2. Substraction");
	System.out.println("3. Product");
	System.out.println("4. Quotient");
	System.out.println("5. Modulus");
	System.out.println("----------------------------------------");
	int ch=1;
	switch(ch) {
	case 1: int c=a+b;
	       System.out.println("Addition="+c);
	       break;
	case 2: int c1=a-b;
           System.out.println("Minus="+c1);
           break;
	case 3: int c3=a*b;
          System.out.println("Product="+c3);
           break;
	case 4: int c4=a/b;
           System.out.println("Quotient="+c4);
           break;
	case 5: int c5=a%b;
           System.out.println("Modulus="+c5);
           break;       
	       
}
}
}
