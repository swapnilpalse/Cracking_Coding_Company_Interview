package com.cracking.coding.company.linkedlist.removeduplicates;

import java.util.HashMap;
import java.util.Map;

public class LinkedList {
	Node first;
	Node last;
	private static int size=0;
	public int getSize(){
		return this.size;
	}
	public void add(Node node) {
		size++;
		if (first == null) {
			first = node;
			last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public void removeUsingData(int data) {
		Node node = first;
		boolean flag = false;
		if (node.getData() == data) {
			first = node.next;
			node = null;
			flag = true;
		} else {
			while (node.next != null) {
				if (node.next.getData() == data) {
					Node nodeTemp = node.next;
					if (nodeTemp == last) {
						last = node;
						last.next = null;
						nodeTemp = null;
						flag = true;
						break;
					} else {
						node.next = node.next.next;
						nodeTemp = null;
						flag = true;
						break;
					}
				}
				node = node.next;
			}
		}
		if (!flag) {
			System.out.println("No such data found");
		}
	}

	public void remove(Node node) {
		if (node == first) {
			first = node.next;
			node = null;
		} else {
			Node temp = first;
			while (temp.next != null) {
				if (temp.next == node && temp.next != last) {
					temp.next = temp.next.next;
					node = null;
					break;
				} else if (temp.next == node) {
					last = temp;
					temp.next = null;
					node = null;
					break;
				}
				temp = temp.next;
			}
		}
	}

	public void display() {
		Node node = first;
		while (node != null) {
			System.out.print(node.getData() + " -> ");
			node = node.next;
		}
	}

	public void removeDuplicates() {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		Node prev = first;
		Node current = first.next;
		while (current != null) {
			if (!hashMap.isEmpty()) {
				if (hashMap.get(current.getData()) == null) {
					hashMap.put(current.getData(), 1);
				} else {
					prev.next = prev.next.next;
					current = null;
					current = prev.next;
					continue;
				}
			} else {
				hashMap.put(prev.getData(), 1);
				continue;
			}
			prev = prev.next;
			current = current.next;
		}
	}
	public void removeDuplicatesWithoutBuffer() {
		Node prev=first;
		Node head=prev;
		Node current=first.next;
		Node fast=current;
		Node slow=prev;
		while(prev!=null){			
			while(fast!=null){
				if(slow.getData()==fast.getData()){
					if(head.next==last){
						last=head;
						head.next=null;
						continue;
					}else{
						head.next=head.next.next;
						fast=null;
						fast=head.next;
						continue;
					}
				}
				slow=slow.next;
				fast=fast.next;
				head=head.next;
			}
			head=prev;
			prev=prev.next;
			slow=first;
			current=current.next;
			fast=current;
		}
	}
	private Node getKthElementToLast(int k){
		Node node=first;
		int totalNumberOfElementsToPrint=size+1-k;
		for(int i=1;i<=size;i++){
			if(size+1-i==totalNumberOfElementsToPrint){
				return node;
			}else{
				node=node.next;
			}
		}
		return null;
	}
	public void printFormKthElement(int k){
		Node node=getKthElementToLast(k);
		if(node!=null){
			while(node!=null){
				System.out.print(node.getData()+((node.next==null)?"":" -> "));
				node=node.next;
			}
		}else{
			System.out.println("Sorry but invalid input :-");
		}
	}
	public void reverseLinkedList(){
		Node head=first;
		Node nextNode,temp=null;
		do{
			nextNode=head.next;
			head.next=temp;
			temp=head;
			head=nextNode;
			first=temp;
		}while(head!=null);
	}
	
}
