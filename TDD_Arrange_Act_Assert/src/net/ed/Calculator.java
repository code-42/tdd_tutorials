package net.ed;

//source: TDD Unit Tests in Java - Arrange, Act, Assert 
//https://www.youtube.com/watch?v=d1EAyR_NCOA

public class Calculator {

	private NumberSource numberSource;

	public long addTwoNumbers() {
		
		return numberSource.fetchNextNumber();
	}
	
}
