package javabasic;

public class StaticAndNonStaticMethods {
public static void main(String[] args) {
	System.out.println("From main method");
	method1();
	StaticAndNonStaticMethods obj=new StaticAndNonStaticMethods();
	obj.method2();
}
private static void method1() {
	System.out.println("From static method");
	
}
private void method2() {
	System.out.println("From non static method");
}

}

