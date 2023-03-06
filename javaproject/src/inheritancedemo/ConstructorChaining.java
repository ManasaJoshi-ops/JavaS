package inheritancedemo;

public class ConstructorChaining {
public static void main(String[] args) {
	ChildClass cc=new ChildClass();
	System.out.println("-----------");
	ChildClass cc1=new ChildClass(6);
}
}
class SuperClass{
	int x;
	SuperClass(){
		System.out.println("No arg SuperClass Constructor");
	}
	SuperClass(int x){
		this.x=x;
		System.out.println("One arg SuperClass Constructor");
	}
}
class ChildClass extends SuperClass{
	ChildClass(){
		this(9);
		System.out.println("No arg ChildClass Constructor");
	}
	ChildClass(int y){
		super(y);
		System.out.println("One arg ChildClass Constructor");
	}
}
