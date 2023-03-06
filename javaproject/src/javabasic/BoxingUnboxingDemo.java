package javabasic;

public class BoxingUnboxingDemo {
public static void main(String[] args) {
	
	int a=6;//primitive
	Integer a1=new Integer(10); //wrapper class
	System.out.println(a1);
	System.out.println(a);
	
	//Boxing : from primitive to wrapper
	
	Integer i=3;
	System.out.println(i);
	
	//Unboxing : from wrapper to primitive 
	
	Integer i1=new Integer(10);
	int z=i1;
	System.out.println(z);
	
	Integer y=200;
	if(y>100) {
		System.out.println(y);
	}
}
}
