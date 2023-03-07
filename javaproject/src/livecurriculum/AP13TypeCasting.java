package livecurriculum;

public class AP13TypeCasting {
public static void main(String[] args) {
	System.out.println("Implicit Conversions");
	
	int a=10;
	float b=a;
	System.out.println(b);
	
	char ch='c';
	int i=ch;
	System.out.println(i);
	
	float f=1.4f;
	double d=f;
	System.out.println(d);
	
	System.out.println("------");
	System.out.println("Explicit conversion");
	
	float f1=17.3f;
	int a1=(int) f1;
	System.out.println(a1);
	
	int i1=109;
	char ch1=(char) i1;
	System.out.println(ch1);
}
}
