package net.ed;

public class StringUtils {

	public int FindNumberOfOccurences(String sentenceToScan, char characterToScanFor) {

        char[] stringToCheckAsCharacterArray = sentenceToScan.toCharArray();
		
		int numberOfOccurenes = 0, same = 0;
		for (char letter : stringToCheckAsCharacterArray)
			same = (letter == characterToScanFor) ? numberOfOccurenes++ : 0; 

        return numberOfOccurenes;
	}
	
	public int FindNumberOfOccurences(String sentenceToScan, String characterToScanFor) {

		try {
	        String[] stringToCheckAsCharacterArray = sentenceToScan.split("");
			
			int numberOfOccurenes = 0, same = 0;
			for (String letter : stringToCheckAsCharacterArray)
				same = (letter == characterToScanFor) ? numberOfOccurenes++ : 0; 
	
	        return numberOfOccurenes;
		} catch (Exception e ){
			throw new IllegalArgumentException();
		}
	}

}
