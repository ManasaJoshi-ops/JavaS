package inheritancedemo;

public class Inheritance2 {
public static void main(String[] args) {
	Bike bike=new Bike();
	System.out.println(bike.fuel());
	Car car=new Car();
	System.out.println(car.fuel());
	Bus bus=new Bus();
	System.out.println(bus.fuel());
}
}
class Vehicle{
	public String fuel() {
		return "Petrol";
	}
}
class Bike extends Vehicle{
	
}
class Car extends Vehicle{
	public String fuel() {
		return "Diesel";
	}
}
class Bus extends Vehicle{
	public String fuel() {
		return super.fuel();
	}
}
