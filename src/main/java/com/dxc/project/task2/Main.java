package com.dxc.project.task2;

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(1);
		list.add(1);
		list.add(3);
		list.print();
		System.out.println("count: " + list.count());
		list.delete(1);
		list.print();
		System.out.println(" ");

		Stack stack = new Stack();
		stack.add(4);
		stack.add(5);
		stack.add(7);
		stack.print();
		System.out.println("count:" + stack.count());
		
		stack.delete();
		
		
		stack.print();
		
		System.out.println(" ");
		
		
		

		Queue queue = new Queue();
		queue.add(3);
		queue.add(0);
		queue.add(2);
		queue.add(5);
		queue.print();
		System.out.println("count:" + queue.count());
		queue.print();
		System.out.println(" ");

	}

}
