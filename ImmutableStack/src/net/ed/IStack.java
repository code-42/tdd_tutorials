package net.ed;

public interface IStack<T> {
	
	IStack<T> push(T value);
	IStack<T> pop();
	T peek();
	boolean isEmpty = true;
	

}
