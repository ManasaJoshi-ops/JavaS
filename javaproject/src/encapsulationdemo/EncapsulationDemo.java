package encapsulationdemo;

public class EncapsulationDemo {
public static void main(String[] args) {
	Car car=new Car();
	car.setColour("white");
	System.out.println(car.getColour());
	System.out.println(car.getNumofwheels());
	
//	System.out.println(car.colour="green");
	
}
}
class Car{

	private String colour;
	private int numofwheels;
//	private static String manufacturer="Honda";
	private boolean customizable;
	Car() {
		numofwheels=4;
		colour="red";
		customizable=true;
		
	}

public String getColour() {
	return colour;
}
public void setColour(String colour) {
	if(customizable) {
		this.colour=colour;
	}
}
public int getNumofwheels() {
		return numofwheels;	
	
}

}