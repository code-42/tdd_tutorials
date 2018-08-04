package net.ed;

public class FizzBuzz {

	static String FizzBuzz(int number) {
		if(number % 3 == 0) {
			return "Fizz";
		} else if(number % 5 == 0) {
			return "Buzz";
		} 
		
		return "FizzBuzz";
		
	}
}
