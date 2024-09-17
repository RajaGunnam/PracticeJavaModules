package javaCollections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface02 {

	List<String> studentNames = new ArrayList<String>();
	List<String> l1 = new ArrayList<String>();
	public List<String> listMethods01() {
		
		l1.add("Raja");
		l1.add("Nava");
		l1.add("Lova");
		l1.add("Rajasekhar");
		l1.add("Mahesh");
		return l1;
	}
	
	public void listMethods02() {
		
		//Copy list from l1 to studentNames
		studentNames.addAll(l1);
		System.out.println(studentNames);
		
//		if(studentNames.equals(l1)) {
//			System.out.println("Both the collections are same");
//		}
//		else System.out.print("Different collections");
		
		//Get a value at specified index
		
		System.out.println(studentNames.get(2));
		
//		//Remove object
//		l1.remove("Mahesh");
//		System.out.println(l1);
//		//Remove by index value
//		studentNames.remove(3);
		
		
		//to check collection is empty or not
		
		System.out.println("Check empty or not- "+studentNames.isEmpty());
		
		//Check all the l1 collection is available in the studentNames collection
		
		System.out.println("studentNames contains all the l1 values "+l1.containsAll(studentNames));
		
		System.out.println(l1.size());
		
		
//		//for each
//		for (Object n : studentNames) {
//			System.out.println(n);
//		}
		
		
	}
	
	
	public static void main(String[] args) {
		ListInterface02 li1 = new ListInterface02();
		System.out.println(li1.listMethods01());
		li1.listMethods02();
	}

	
}
