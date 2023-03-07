package arraydemo;

public class ArrayDemo {
public static void main(String[] args) {
    int [] arr= {3,5,4,5,6,3,5,7};
//	System.out.println(arr);
//	printArray(arr);
//	arr[2]=5;
//	printArray(arr);
//	arr[0]=99;
//	printArray(arr);
//	challenge1();
//	sumOfArray(arr);
//	foreachAdd(arr);
//    sumOfEvenNumbersArray(arr);
//    reverseOfStringChars();
    reverseOfStringCharsMeth2();
}



private static void printArray(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
private static void challenge1(int[] arr) {
	printArray(arr);
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==5 && arr[i-1]==3) {
			arr[i]=0;
			System.out.print(arr[i]+" ");
		}else {
			System.out.print(arr[i]+" ");
		}
	}
	
}
private static void sumOfArray(int[] arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	System.out.println(sum);
}
private static void foreachAdd(int[] arr) {
	int sum=0;
	for (int i:arr) {
		sum+=i;
	}
	System.out.println(sum);
}

private static void sumOfEvenNumbersArray(int[] arr) {
	int sum=0;
	for(int i:arr) {
		if(arr[i]%2==0) {
			sum+=arr[i];
		}
		
	}System.out.println(sum);
   
}

private static void reverseOfStringChars() {
	String s="hello world";
	for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
	
}
private static void reverseOfStringCharsMeth2() {
	String s="hello world";
	char [] ch=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
	    System.out.print(ch[i]);
}
}
}
