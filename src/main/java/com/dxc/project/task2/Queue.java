package com.dxc.project.task2;

public class Queue implements dataStructure {
	private LinkedList list;

	public void add(int data) {
		list.addFirst(data);

	}

	public Integer delete() {
		return list.deleteLast();
	}
	public void delete(int data) {
		// TODO Auto-generated method stub
	}

	public void print() {
		list.print();
	}

	public int count() {
		return list.count();
	}

}
