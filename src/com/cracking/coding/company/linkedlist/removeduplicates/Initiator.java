package com.cracking.coding.company.linkedlist.removeduplicates;

import java.util.Scanner;

public class Initiator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		LinkedList linkedList=new LinkedList();
		int input=0;
		int data;
		boolean flag=false;
		while(true){
			System.out.println("Press 1 to insert new node in linked list");
			System.out.println("Press 2 to remove the data from the linkedList");
			System.out.println("Press 3 to remove duplicate");
			System.out.println("Press 4 to display");
			System.out.println("Press 5 to remove without buffer");
			System.out.println("Press 6 to print Kth to last element of the list");
			System.out.println("Press 7 to reverse");
			System.out.println("Press 8 to exit");
			input=scanner.nextInt();
			switch(input){
			case 1:{
						System.out.println("Enter the data for the node to be entered");
						data=scanner.nextInt();
						Node node=new Node(data);
						linkedList.add(node);
						System.out.println("Data Added");
						break;
				   }
			case 2:{
						System.out.println("Enter data to for removal of node");
						data=scanner.nextInt();
						linkedList.removeUsingData(data);
						//System.out.println();
						break;
				   }
			case 3:{
						linkedList.removeDuplicates();
						System.out.println("Completed!!! Please use Dipslay result to verify");
						break;
				   }
			case 4:{
						linkedList.display();
						break;
				   }
			case 5:{
						linkedList.removeDuplicatesWithoutBuffer();
						System.out.println("Completed!!! Please use Dipslay result to verify");
						break;
					}
			case 6:{
						System.out.println("Please enter the value for k");
						int k=scanner.nextInt();
						linkedList.printFormKthElement(k);
						break;
				   }
			case 7:{
						linkedList.reverseLinkedList();
						linkedList.display();
						break;
					}
			default:System.out.println("Invalid input");
					break;
			}
			System.out.println("");
			System.out.println("******************************************************************");
		}
	}
}
