package errorhandlingdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
public static void main(String[] args) {
	checkedException();
}
private static void checkedException() {
	try {
		FileInputStream fis=new FileInputStream("/Users/manasajoshi/Desktop/myfile");
	} catch (FileNotFoundException e) {
		System.out.println("Exception occured.."+e.getMessage());
	}
}
}
