package net.ed;

//source: TDD Unit Tests in Java - Arrange, Act, Assert 
//https://www.youtube.com/watch?v=d1EAyR_NCOA

public class Calculator {

	private final NumberSource numberSource;
	
	// add constructor with dependency injection
	Calculator(final NumberSource numberSource) {
		this.numberSource = numberSource;
	}

	public long addTwoNumbers() {
		return numberSource.fetchNextNumber();
	}
	
}
