package inheritancedemo;

public class MultipleInheritance {
public static void main(String[] args) {
	Frog f=new Frog();
	f.livesIn();
}
}
class Frog implements Aquatic, Terestrial{

	@Override
	public void livesIn() {
		// TODO Auto-generated method stub
		Aquatic.super.livesIn();
		Terestrial.super.livesIn();
	}

}

interface Aquatic{
	default void livesIn() {
		System.out.println("Lives in water");
	}
}

interface Terestrial{
	default void livesIn() {
		System.out.println("Lives on land");
	}
}