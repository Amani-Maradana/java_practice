package com.codegnan.collection_framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(5);
		pq.add(3);
		pq.add(1);
		pq.add(4);
		pq.add(2);
		pq.add(6);
		System.out.println(pq);

	}

}
