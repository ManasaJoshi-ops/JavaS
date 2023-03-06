package inheritancedemo;

public class DiamondProblem {
public static void main(String[] args) {
	TV tv=new TV();
	tv.powerOn();
	DesktopComputer dc=new DesktopComputer();
	dc.starter();
}
}
class EletronicDevices{
	void powerOn() {
		System.out.println("Devices turned on..");
	}
}
class TV extends EletronicDevices {
	void powerOn() {
		System.out.println("TV turned on..");
	}
	void switcher() {
	System.out.println("hello");
	}
}
class Monitor extends EletronicDevices{
	void powerOn() {
		System.out.println("Monitor turned on..");
	}
}

class DesktopComputer implements I1, I2{

	@Override
	public void starter() {
		I1.super.starter();
		I2.super.starter();
	}
	
	
}
