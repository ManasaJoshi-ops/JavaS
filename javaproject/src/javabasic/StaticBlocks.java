package javabasic;

public class StaticBlocks {
public static void main(String[] args) {
	System.out.println("From main method");
}
static {
	System.out.println("From static block");
}
}