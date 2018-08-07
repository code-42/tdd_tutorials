package net.ed;

public class ListNode<T> {
	
    public ListNode(T value)
    {
//        throw new UnsupportedOperationException();
    	this.value = value;
    }

    public ListNode<T> next;
    public T value;
}
