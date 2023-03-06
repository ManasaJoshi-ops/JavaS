package inheritancedemo;

public class MethodOverridingDemo {
public static void main(String[] args) {
Buss bu=new Buss(1,2,1,1);
bu.energy();
}
}
class Veh{
	int a,b;
	Veh(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void energy() {
		System.out.println("Petrol");
	}
}
class Buss extends Veh{
	int c,d;
	Buss(int a, int b,int c, int d) {
		super(a, b);
		this.c=c;
		this.d=d;
	}

	public void energy() {
		System.out.println("CNG");
	}
}

