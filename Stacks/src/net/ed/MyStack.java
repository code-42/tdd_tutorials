package net.ed;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
	
	private List<T> myList = new ArrayList<T>();
	
	int count = 0;
	boolean isEmpty = true;

	public MyStack() {}

	public boolean isIsEmpty() {
		return count == 0;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	private int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void push(T value) {
		myList.add(value);
		isEmpty = false;
	}
	
	public void pop() throws IllegalStateException {

		if(myList.isEmpty()) 
			throw new IllegalStateException();
		myList.remove(myList.size() - 1);
	}
	
	public int peek() {
		return myList.size();
	}

}
