package net.ed;

public class MyStack<T> {
	
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
		this.count++;
		isEmpty = false;
	}
	
	public void pop() throws IllegalStateException {

		if(isEmpty) {
			throw new IllegalStateException();
		}
	}

}
