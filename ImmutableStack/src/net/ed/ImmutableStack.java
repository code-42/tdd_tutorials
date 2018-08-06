package net.ed;

public class ImmutableStack<T> implements IStack<T> {
	
	public class EmptyStack implements IStack<T>{
		
		@Override
		public IStack<T> push(T value) {
			return new ImmutableStack<T>(value);
		}

		@Override
		public IStack<T> pop() {

			throw new IllegalStateException();
		}

		@Override
		public T peek() {

			throw new IllegalStateException();
		}
		
		public boolean isEmpty = true;
	}
	
	private T head;
	
	ImmutableStack(T head) {
		this.head = head;
	}

	@Override
	public IStack<T> push(T value) throws UnsupportedOperationException {
		return new ImmutableStack<T>(value);
	}

	@Override
	public IStack<T> pop() {
		return null;
	}

	@Override
	public T peek() {
		return head;
	}
	
	private final EmptyStack empty = new EmptyStack();

	public IStack<T> Empty = empty;	
	
}
