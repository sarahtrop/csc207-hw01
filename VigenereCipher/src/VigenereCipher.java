
public class VigenereCipher {

	public static void encode(String message, String keyword) {
		int numLetters = message.length();
		int base = (int)'a';
		
		//declaring and initialzing arrays to be used later
		char[] messageCharArray = message.toCharArray();
		char[] keywordCharArray = keyword.toCharArray();
		
		int[] messageIntArray = new int[numLetters];
		int[] keywordIntArray = new int[numLetters];
		
		int[] encodedIntArray = new int[numLetters];
		char[] encodedCharArray = new char[numLetters];
		
		//transposing characters in message and keyword to integers
		for (int i=0; i<numLetters; i++) {
			messageIntArray[i] = (int)messageCharArray[i] - base;
			keywordIntArray[i] = (int)keywordCharArray[i] - base;
		}
		
		//encoding message
		for (int j=0; j<numLetters; j++) {
			
		}
		
	}
	
	public static void decode(String message, String keyword) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
