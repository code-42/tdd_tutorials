package net.ed;

public class StringSwapper {

	public String swap2Chars(String string) {
		
		char firstChar = string.charAt(0);
		char secondChar = string.charAt(1);
		
		return "" + secondChar + firstChar;
	}

	public String swapLast2Chars(String string) {
		
		int stringLength = string.length();
		
		String stringMinusLast2Chars = string.substring(stringLength - 2, stringLength);
		
		char firstChar = string.charAt(0);
		char secondChar = string.charAt(1);
		char thirdChar = string.charAt(2);
		char fourthChar = string.charAt(3);
		System.out.println(stringMinusLast2Chars);
		
		return "" + firstChar + secondChar  + fourthChar + thirdChar;
	}
}
