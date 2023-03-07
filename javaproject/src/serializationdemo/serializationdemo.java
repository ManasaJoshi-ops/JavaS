package serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serializationdemo {
public static void main(String[] args) {
//	Employee emp1=new Employee(1,"Mark",15000,"AA980");
//	System.out.println(emp1);
//	Employee emp2=new Employee(2,"Muller",25000,"AA981");
//	System.out.println(emp2);
	serialisationDemo();
	deserializationDemo();
//	serializationDemoSimplified();
}

private static void serializationDemoSimplified() {
try(FileOutputStream fos=new FileOutputStream("/Users/manasajoshi/objectstream/emp.scr");
		ObjectOutputStream oos=new ObjectOutputStream(fos);) {
		Employee emp1=new Employee(1,"Mark",15000,"AA980");
		oos.writeObject(emp1);
		System.out.println("Object serialised");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
	

private static void deserializationDemo() {
	try(FileInputStream fis=new FileInputStream("/Users/manasajoshi/objectstream/emp.scr");
			ObjectInputStream ois=new ObjectInputStream(fis);) {

			Employee emp=(Employee) ois.readObject();
			System.out.println("Object deserialised :"+emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
}

private static void serialisationDemo() {
	FileOutputStream fos=null;
	ObjectOutputStream oos=null;
	
	try {
		
		fos=new FileOutputStream("/Users/manasajoshi/objectstream/emp.scr");
		oos=new ObjectOutputStream(fos);
		Employee emp1=new Employee(1,"Mark",15000,"AA980");
		oos.writeObject(emp1);
		System.out.println("Object serialised");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
}
class Employee implements Serializable{
	int id;
	String name;
	double salary;
	transient String aadhar;
	Employee(int id,String name,double salary,String aadhar){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadhar=aadhar;
	}
	public String toString() {
		return this.id+"|"+this.name+"|"+this.salary+"|"+this.aadhar;
		
	}
}