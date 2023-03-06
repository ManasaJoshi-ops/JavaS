package polymorphismdemo;

public class CompileTimePoly {
public static void main(String[] args) {
	CompileT ct=new CompileT();
	ct.add(3, 5);
	ct.add(3, 5, 6);
	ct.add(3.8f, 5.8f,3.6f);
}
}
//compile time : method overloading

class CompileT{
	void add(int a, int b, int c) {
		int res=a+b+c;
			System.out.println("result is "+res);
	}
	void add(int a, int b) {
		int res=a+b;
			System.out.println("result is "+res);
	}
	void add(float a, float b, float c) {
		float res=a+b+c;
			System.out.println("result is "+res);
	}
}