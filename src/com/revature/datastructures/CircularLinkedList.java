package com.revature.datastructures;

public class CircularLinkedList {

	  public static class Node {
	    public int data;
	    Node next;
	    Node() {}
	    Node(int data) {
	      this.data = data;
	    }
	  }

	  private Node head;
	  private Node tail;

	  // constructor   
	  public CircularLinkedList() {
	    this.head = null;
	    this.tail = null;
	  }

	  public boolean isEmpty() {
	    return head == null;
	  }

	  public void insertAtFirst(int data) {
	    Node newNode = new Node(data);
	    //Checks if the list is empty.   
	    if (head == null) {
	      //If list is empty, both head and tail would point to new node.   
	      head = newNode;
	      tail = newNode;
	      newNode.next = head;
	    } else {
	      //Store data into temporary node   
	      Node temp = head;
	      //New node will point to temp as next node   
	      newNode.next = temp;
	      //New node will be the head node   
	      head = newNode;
	      //Since, it is circular linked list tail will point to head.   
	      tail.next = head;
	    }
	  }

	  public void insertAtLast(int data) {
	    //Create new node   
	    Node newNode = new Node(data);
	    //Checks if the list is empty.   
	    if (head == null) {
	      //If list is empty, both head and tail would point to new node.   
	      head = newNode;
	      tail = newNode;
	      newNode.next = head;
	    } else {
	      //tail will point to new node.   
	      tail.next = newNode;
	      //New node will become new tail.   
	      tail = newNode;
	      //Since, it is circular linked list tail will point to head.   
	      tail.next = head;
	    }
	  }
	  
	  public Node getLast() {
		  Node lastNode = null;
		  
		  if(head == null) {
			  return null;
		  }else {
			  lastNode = tail;
		  }
		  
		  return lastNode;
	  }

	  public void display() {
	    Node temp = head;
	    if (head != null) {
	      do {
	        System.out.printf("%d ", temp.data);
	        temp = temp.next;
	      } while (temp != head);
	    }
	    System.out.printf("\n");
	  }

	  public int size() {
	    int size = 0;
	    if (head != null) {
	      Node temp = head;
	      while (temp.next != head) {
	        temp = temp.next;
	        size++;
	      }
	      size++;
	    }
	    return size;
	  }

}