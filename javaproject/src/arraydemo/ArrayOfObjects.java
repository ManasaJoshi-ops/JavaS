package arraydemo;

import java.io.Serializable;

public class ArrayOfObjects {
public static void main(String[] args) {
	Employee[] employees =new Employee[3];
	Employee emp1 =new Employee(1,"mark",17000,"AA123");
	Employee emp2 =new Employee(2,"fuller",18000,"AA124");
	Employee emp3 =new Employee(3,"john",19000,"AA125");
	employees[0]=emp1;
	employees[1]=emp2;
	employees[2]=emp3;
	for(Employee e:employees) {
		System.out.println(e);
	}
}
}
class Employee implements Serializable{
	int id;
	String name;
	double salary;
	String aadhar;
	Employee(int id, String name, double salary, String aadhar){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadhar=aadhar;
	}
	public String toString() {
		return this.id+"|"+this.name+"|"+this.salary+"|"+this.aadhar;
	}
}
