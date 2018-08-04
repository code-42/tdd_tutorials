package net.ed;

public class FizzBuzz {

	static String FizzBuzz(int number) {
		
		if(number % 3 == 0 && number % 5 == 0) {
			System.out.println("FizzBuzz");
			return "FizzBuzz";
		} else if(number % 3 == 0) {
			System.out.println("Fizz");
			return "Fizz";
		} else if(number % 5 == 0) {
			System.out.println("Buzz");
			return "Buzz";
		} else {
			return "";
		}
	}
}
