package javaCollections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface01 {

	public static void main(String args[]) {
	//Priority Queue
	PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
	pq1.add(413);
	pq1.add(414);
	pq1.add(415);
	pq1.add(404);
	//pq1.offer(322);
	System.out.println("Print collection Elements - "+pq1);
	System.out.println("Peek Method - "+pq1.peek());
	System.out.println("Poll Method - "+pq1.poll());
	System.out.println("Print collection Elements - "+pq1);
	QueueInterface01 qi = new QueueInterface01();
	
	qi.qTest();
	}
	
	public void qTest() {
		Queue<Integer> a= new LinkedList<Integer>();
		a.add(76676);
		a.add(32);
		a.add(344);
		a.add(32);
		System.out.println(a.peek());
		System.out.println(a);
	}
}
