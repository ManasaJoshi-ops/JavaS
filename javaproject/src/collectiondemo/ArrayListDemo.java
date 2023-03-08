package collectiondemo;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
//	demo1();
//	demo2();
//	demo3();
	rangeOfObj();

	
}

private static void demo1() {
	ArrayList list =new ArrayList();
	list.add(10);
	list.add("hello");
	list.add("world");		
	
	System.out.println(list);
	
}
private static void demo2() {
	ArrayList<String> alist=new ArrayList<String>();
	alist.add("hello");
	alist.add("world");
	alist.add("How are you");
	
	System.out.println(alist);
}
private static void demo3() {
	ArrayList<Integer> list =new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);		
	
	System.out.println(list);
	
}
private static void rangeOfObj() {
	ArrayList <Integer> newlist=new ArrayList<Integer>();
	
	for(int i=10;i<=100;i+=10) {
		newlist.add(i);
	}
	System.out.println(newlist);
	//set value 101 at index 3
	newlist.set(3, 101);
	System.out.println(newlist);
	//remove a value from the list
	newlist.remove(5);
	System.out.println(newlist);
	//search for a value
	int value=101;
	if (newlist.contains(value)) {
		System.out.println("In list");
	}
	else {
		System.out.println("Not in list");
	}
}
	






}
