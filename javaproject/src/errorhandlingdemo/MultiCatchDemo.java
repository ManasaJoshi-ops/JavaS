package errorhandlingdemo;

public class MultiCatchDemo {
public static void main(String[] args) {
	try {
		String s="8";
		int i=Integer.parseInt(s);
		System.out.println(i);
		String s1=null;
		System.out.println(s1.length());
	}catch(NullPointerException e) {
		System.out.println("Exception occured"+e.getMessage());
	}catch(NumberFormatException e) {
		System.out.println("Exception occured"+e.getMessage());
	}
}
}
