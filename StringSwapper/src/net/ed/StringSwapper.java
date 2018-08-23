package net.ed;

public class StringSwapper {

	public String swapLast2Chars(String string) {
		
		char firstChar = string.charAt(0);
		char secondChar = string.charAt(1);
		
		return "" + secondChar + firstChar;
	}

}
