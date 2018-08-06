package net.ed;

public class MyStack {
	
	public boolean isEmpty;
	public int count;

	public boolean isIsEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public void push(int i) {

		count++;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
