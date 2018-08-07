package net.ed;

public class MyLinkedList<T> {
	
	public ListNode<T> head;
	public ListNode<T> tail;
	public int count;
	
	public void addFirst(T value) {

		addFirst(new ListNode<T>(value));
	}
	
	public void addFirst(ListNode<T> node) {

		// save the head node so we don't lose it
		ListNode<T> temp = head;
		
		// point head to the new node
		head = node;
		
		// insert the rest of the list behind the head
		head.next = temp;
		
		count++;
		
		if(count == 1)
			tail = head;
	}

	public void addLast(T value) {

		addLast(new ListNode<T>(value));
		
	}
	
	public void addLast(ListNode<T> node) {
		
		head = tail = node;
		
	}

}
