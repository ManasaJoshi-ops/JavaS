package collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
//	createRandomNum();
	hashsetDemo();	
}

private static void createRandomNum() {
	Random random=new Random() ;
		int x=random.nextInt(1,10);
		System.out.println(x);
}

private static void hashsetDemo() {
	Random random =new Random();
	List<Integer> list =new ArrayList<Integer>();
	for(int i=1;i<=10;i++) {
		list.add(random.nextInt(1,10));
	}System.out.println(list);
	Set <Integer> set1=new HashSet<Integer>(list);
	System.out.println(set1);
	Set <Integer> set2=new LinkedHashSet<Integer>(list);
	System.out.println(set2);
	Set <Integer> set3=new TreeSet<Integer>(list);
	System.out.println(set3);
//	
}
}
