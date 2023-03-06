package abstractdemo;

public class AbstractionDemo {
public static void main(String[] args) {
	ThreeSeries ts=new ThreeSeries();
	ts.start();
	ts.accelerate();
	System.out.println("--------------");
	FiveSeries fs=new FiveSeries();
	fs.start();
	fs.accelerate();
	System.out.println("--------------");
	BMW bmw=new ThreeSeries();
	bmw.start();
	bmw.accelerate();
	System.out.println("---------------");
}
}
abstract class BMW{
	void start() {
		System.out.println("BMW starts..");
	}
	abstract void accelerate();
}
class ThreeSeries extends BMW{

	@Override
	void accelerate() {
		System.out.println("Three times acceleration..");
		
	}
	
}
class FiveSeries extends BMW{

	@Override
	void accelerate() {
		System.out.println("Five times acceleration..");
		
	}
	
}
