package net.ed;

public class MyLinkedList<T> {
	
	public ListNode<T> head;
	public ListNode<T> tail;
	
	public void addFirst(T value) {

		addFirst(new ListNode<T>(value));
	}
	
	public void addFirst(ListNode<T> node) {

		tail = head = node;
	}

}
