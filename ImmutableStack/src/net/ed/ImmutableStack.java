package net.ed;

public class ImmutableStack<T> implements IStack<T> {
	
	public class EmptyStack implements IStack<T>{
		
		public boolean isEmpty = true;

		@Override
		public IStack<T> push(T value) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IStack<T> pop() {

			throw new IllegalStateException();
		}

		@Override
		public T peek() {

			throw new IllegalStateException();
		}
		
	}

	@Override
	public IStack<T> push(T value) {
		return null;
	}

	@Override
	public IStack<T> pop() {
		return null;
	}

	@Override
	public T peek() {
		return null;
	}
	
	private final EmptyStack empty = new EmptyStack();

	public IStack<T> Empty = empty;	
	
}
