package com.dxc.project.task2;

public class Stack implements dataStructure {

	private LinkedList list;

	public Stack() {
		this.list = new LinkedList();

	}

	public void add(int data) {
		list.add(data);
	}

	public Integer delete() {
		return list.deleteLast();
	
	}

	public void print() {
		list.print();
	}
	
	public void delete(int data) {
		// TODO Auto-generated method stub
	}

	public int count() {
		return list.count();

	}

}
