package arrayProgramming;

import java.util.Scanner;

public class ArrayPrograms {
	
	public static void main(String args[]) {
		
		String s[] = {"iphone 13", "iphone 13 pro", "iphone 13 pro max"};
		int a[] = new int[4];
		a[0]=10;
		a[1]= 20;
		a[2]= 20;
		a[3]= 20;
		
		for (int i=0;i<a.length; i++) {
			System.out.println(a[i]);
		}
			
		System.out.println(s[0]);
		System.out.println(s.length);
		
		for (String data: s) {
			System.out.println(data);
		}		
		enterArrayData();
	}
	
	//Array using scanner class
	
	public static void enterArrayData() {
		int size;
		
		System.out.println("Enter size of the array - ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Array elements are - ");
		
		for(int j=0; j<arr1.length;j++) {
			
			System.out.println(arr1[j]);
		}
	}
}
