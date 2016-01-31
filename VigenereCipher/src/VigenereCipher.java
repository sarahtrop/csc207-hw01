import java.util.Scanner;

public class VigenereCipher {

	public static void encode(String message, String keyword) {
		int numLetters = message.length();
		int base = (int)'a';
		
		//declaring and initializing arrays to be used later
		char[] messageCharArray = message.toCharArray();
		char[] keywordCharArray = new char[numLetters];
		
		for (int l=0; l<numLetters; l++) {
			keywordCharArray[l] = keyword.charAt(l % keyword.length());
		}
		
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
			encodedIntArray[j] = messageIntArray[j] + keywordIntArray[j];
		}
		
		//converting back to characters
		for (int k=0; k<numLetters; k++) {
			encodedCharArray[k] = (char)(encodedIntArray[k] + base);
		}
		
		String encodedMessage = new String(encodedCharArray);
		System.out.println(encodedMessage);
	}
	
	public static void decode(String message, String keyword) {
		int numLetters = message.length();
		int base = (int)'a';
		
		//declaring and initializing arrays to be used later
		char[] messageCharArray = message.toCharArray();
		char[] keywordCharArray = new char[numLetters];
		
		for (int l=0; l<numLetters; l++) {
			keywordCharArray[l] = keyword.charAt(l % keyword.length());
		}
		
		int[] messageIntArray = new int[numLetters];
		int[] keywordIntArray = new int[numLetters];
		
		int[] decodedIntArray = new int[numLetters];
		char[] decodedCharArray = new char[numLetters];
		
		//transposing characters in message and keyword to integers
		for (int i=0; i<numLetters; i++) {
			messageIntArray[i] = (int)messageCharArray[i] - base;
			keywordIntArray[i] = (int)keywordCharArray[i] - base;
		}
		
		//decoding message
		for (int j=0; j<numLetters; j++) {
			decodedIntArray[j] = messageIntArray[j] - keywordIntArray[j];
		}
		
		//converting back to characters
		for (int k=0; k<numLetters; k++) {
			decodedCharArray[k] = (char)(decodedIntArray[k] + base);
		}
		
		String decodedMessage = new String(decodedCharArray);
		System.out.println(decodedMessage);
	}
	
	public static void main(String[] args) {
		System.out.println("This program encrypts and decrypts messages using the Vigenere Cipher.\nWould you like to encode or decode a message?");
		Scanner choiceIn = new Scanner(System.in);
		String choice = choiceIn.nextLine();
		
		if (choice == "encode") {
			System.out.println("Enter the string to encode:");
			Scanner messageIn = new Scanner(System.in);
			String message = messageIn.nextLine();
			
			System.out.println("Enter the key:");
			Scanner keyIn = new Scanner(System.in);
			String key = keyIn.nextLine();
			
			encode(message, key);
		}
		
		else if (choice == "decode") {
			System.out.println("Enter the string to decode:");
			Scanner messageIn = new Scanner(System.in);
			String message = messageIn.nextLine();
			
			System.out.println("Enter the key:");
			Scanner keyIn = new Scanner(System.in);
			String key = keyIn.nextLine();
			
			decode(message, key);
		}
	}

}
