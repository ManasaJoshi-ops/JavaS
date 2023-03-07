package javabasic;

public class NonsStaticMembers {
public static void main(String[] args) {
	System.out.println("From main method");
	NonsStaticMembers nsm=new NonsStaticMembers();
	
}
public NonsStaticMembers() {
	System.out.println("From non static constructor");
}

{
	System.out.println("From non static block");
}

}

