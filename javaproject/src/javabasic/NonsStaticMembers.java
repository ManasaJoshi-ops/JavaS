package javabasic;

public class NonsStaticMembers {
public static void main(String[] args) {
	NonsStaticMembers nsm=new NonsStaticMembers();
	System.out.println("From main method");
}
public NonsStaticMembers() {
	System.out.println("From non static constructor");
}
{
	System.out.println("From non static block");
}
}

