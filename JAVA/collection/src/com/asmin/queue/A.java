package com.asmin.queue;

import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class A {
	public static void main(String[] args) {   
		Queue queue = new PriorityQueue();
		queue.offer("AAA");						// offer();
		queue.offer("BBB");						//           
		queue.offer("EEE");
		queue.offer("CCC");
		queue.offer("FFF");
		queue.offer("DDD");
		System.out.println(queue);
		System.out.println();
		
		System.out.println(queue.poll());		// poll();
		System.out.println(queue);
		System.out.println();
		
		System.out.println(queue.remove());		// remove();
		System.out.println(queue);
		System.out.println();
		
		System.out.println(queue.peek());       // peek();  =  It will return only head element but not remove the head element
		System.out.println(queue);
		System.out.println();
		
		System.out.println(queue.element());	// element(); = It will return only head element but not remove the head element
		System.out.println(queue);
	}
}
