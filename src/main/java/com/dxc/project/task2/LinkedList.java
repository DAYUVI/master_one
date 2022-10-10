package com.dxc.project.task2;

public class LinkedList implements dataStructure {

	private Node head;
	private Node last;

	/**
	 * 
	 */
	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			last = head;
		} else {
			Node lastNode = last;// create Node lastNode to access last entered node
			lastNode.setNextNode(new Node(data));
			last = lastNode.getNextNode();
		}
	}

	public void addFirst(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node nextNode = head;
			head = new Node(data);
			head.setNextNode(nextNode);

		}
	}

	public void delete(int data) {
		Node prevNode = null;
		Node currentNode = head;

		while (currentNode != null) {
			if (currentNode.getData() == data) {
				if (prevNode == null) {
					head = currentNode.getNextNode();
					currentNode = head;
					break;
				} else {
					prevNode.setNextNode(currentNode.getNextNode());
				}
			} else {
				prevNode = currentNode;
				currentNode = currentNode.getNextNode();
			}
		}
	}

	public Integer deleteFirst() {
		if (head != null) {
			int data = head.getData();
			head = head.getNextNode();
			return data;
		}
		return null;
	}

	public int deleteLast() {
		Node currentNode = head;

		while (currentNode != null && currentNode.getNextNode() != null && !currentNode.getNextNode().equals(last)) {
			currentNode = currentNode.getNextNode();
		}
		int data = last.getData();
		currentNode.setNextNode(null);
		last = currentNode;

		return data;

	}

	public int count() {
		int count = 0;

		Node currentNode = head;
		while (currentNode != null) {
			currentNode = currentNode.getNextNode();
			count++;
		}

		return count;
	}

	public Node getHead() {
		return head;
	}

	public void print() {
		Node currentNode = head;

		while (currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}

	public Node getLast() {
		return last;
	}
}
