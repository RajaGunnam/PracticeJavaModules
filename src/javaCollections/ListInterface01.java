package javaCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterface01 {

	public static void main(String args[]) {

		// Array List class

		List<Integer> list1 = new ArrayList<>();

//		list1.add(5);
//		list1.add(3);
//		list1.add(9);
//		list1.add(3);
//		list1.add(1);
//		list1.sort(Comparator.naturalOrder());  // Sorts the list in natural (ascending) order.
//		System.out.println(list1); 
//		
//		list1.sort(Comparator.reverseOrder());  // Sorts the list in natural (ascending) order.
//		System.out.println(list1); 

//		for (int i=0; i<list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
		// for each loop
//		for(Object i:list1) {
//			System.out.println(i);
//		}

		for (int i = 0; i <= 50; i = i + 5) {
			list1.add(i);
		}

		// Cursor Concepts
		// A. Iterator
//		Iterator<Integer> i1 = list1.iterator();
//		System.out.println("Before removal of vlaue");
//
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.print(list1.get(i) + " ");
//		}
//		
//		while (i1.hasNext()) {
//			if(i1.next()%2==1) {
//				i1.remove();
//			}
//			
//		}
//		System.out.println("List after removal");
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.print(list1.get(i) + " ");
//		}
		
		//B. ListInterator
		
		
		ListIterator<Integer> lI1 = list1.listIterator();
		
		while(lI1.hasNext()) {
			System.out.print(lI1.next()+" ");
		}
		while(lI1.hasPrevious()) {
			System.out.print(lI1.previous()+" ");
		}
		

	}
}
