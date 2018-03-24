package com.cracking.coding.company.linkedlist.removeduplicates;

public class Node {
	Node next;
	private int data;
	public Node(int data) {
		this.setData(data);
		this.next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
