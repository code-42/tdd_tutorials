package net.ed;

public class ImmutableStack<T> implements IStack<T> {
	
	public class EmptyStack implements IStack<T>{
		
		@Override
		public IStack<T> push(T value) {
			return new ImmutableStack<T>(value, (T) this);
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
	private T tail;
	
	ImmutableStack(T head, T tail) {
		this.head = head;
		this.tail = tail;
	}

	@Override
	public IStack<T> push(T value) throws UnsupportedOperationException {
		return new ImmutableStack<T>(value, (T) this);
	}

	@Override
	public IStack<T> pop() {
		return (IStack<T>) tail;
	}

	@Override
	public T peek() {
		return head;
	}
	
	private final EmptyStack empty = new EmptyStack();

	public IStack<T> Empty = empty;	
	
}
