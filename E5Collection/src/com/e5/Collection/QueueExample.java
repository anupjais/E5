package com.e5.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(20);
		queue.add(30);
		queue.add(10);
		queue.add(0);
		queue.add(20);
		queue.add(35);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.remove());
//		System.out.println(queue.element());
		System.out.println(queue);
		
	}
}
