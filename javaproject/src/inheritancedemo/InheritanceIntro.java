package inheritancedemo;

public class InheritanceIntro {
public static void main(String[] args) {
	JDK8 j8=new JDK8();
	j8.j6();
	j8.j8();
}
}
class JDK6 {
	JDK6(){
		System.out.println("JDK6 Installing..");
	}
	void j6(){
		System.out.println("j6 method starting..");
	}
}
class JDK7 extends JDK6{
	JDK7(){
		System.out.println("JDK7 installing..");
	}
}
class JDK8 extends JDK7{
	JDK8(){
		System.out.println("JDK8 installing..");
	}
	void j8() {
		System.out.println("j8 method starting..");
	}

}
