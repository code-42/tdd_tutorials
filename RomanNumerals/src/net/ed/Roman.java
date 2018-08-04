package net.ed;

import java.util.HashMap;
import java.util.Map;

public class Roman {

	public static HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	
	public static int Parse(String roman) {
		
		hmap.put("I", 1);
		hmap.put("V", 5);
		hmap.put("X", 10);
		hmap.put("L", 50);
		hmap.put("C", 100);
		hmap.put("D", 500);
		hmap.put("M", 1000);
		
		String[] romanSplitArr = roman.split("");
		
		int result = 0;
		for (int i = 0; i < romanSplitArr.length; i++) {
			if(hmap.get(romanSplitArr[i]) != null) {
				if(i + 1 < romanSplitArr.length && 
						hmap.get(romanSplitArr[i]) < hmap.get(romanSplitArr[i + 1])) {
					result -= (hmap.get(romanSplitArr[i]));
				} else {
				result += (hmap.get(romanSplitArr[i]));
				}
			}
		}
		System.out.println("36. result == " + result);
		return result;
	}

}
