import java.util.Scanner;

public class CaeserCipher {

	//Encodes a message
	public static void encode(String message) {
		int numLetters = message.length();
		int base = (int)'a';
		
		//declaring and initialzing arrays to be used later
		char[] messageCharArray = message.toCharArray();
		int[] messageIntArray = new int[numLetters];
		
		int[] encodedIntArray = new int[numLetters];
		char[] encodedCharArray = new char[numLetters];
		
		//transposing characters in message to integers
		for (int i=0; i<numLetters; i++) {
			messageIntArray[i] = (int)messageCharArray[i] - base;
		}
		
		//Printing original message
		System.out.println("n = 0: " + message);
				
		//Encoding message using n 1-25
		for (int j=1; j<26; j++) {
			for (int k=0; k<message.length(); k++) {
				//encrypting character
				int encryptedNum = (encodedIntArray[k] + j) % 26;
				encryptedCharArray[k] = (char)(encryptedNum + base);
			}
		}
		//printing the new encrypted string
		String encryptedString = new String(encryptedCharArray);
		System.out.println("n = " + i + ": " + encryptedString);
	}
	
	//Decodes a message
	public static void decode(String message) {
		//Decodes a message
		public static void encode(String message) {
			int numLetters = message.length();
			int base = (int)'a';
			
			//declaring and initialzing arrays to be used later
			char[] messageCharArray = message.toCharArray();
			int[] messageIntArray = new int[numLetters];
			
			int[] decodedIntArray = new int[numLetters];
			char[] decodedCharArray = new char[numLetters];
			
			//transposing characters in message to integers
			for (int i=0; i<numLetters; i++) {
				messageIntArray[i] = (int)messageCharArray[i] - base;
			}
			
			//Printing original message
			System.out.println("n = 0: " + message);
					
			//Decoding message using n 1-25
			for (int j=1; j<26; j++) {
				for (int k=0; k<message.length(); k++) {
					//decrypting character
					int decryptedNum = (decodedIntArray[k] - j) % 26;
					encryptedCharArray[k] = (char)(encryptedNum + base);
				}
			}
			//printing the new decrypted string
			String decryptedString = new String(decryptedCharArray);
			System.out.println("n = " + i + ": " + decryptedString);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("This program encrypts and decrypts messages using the Caeser Cipher.\n Would you like to encode or decode a message?");
		Scanner choiceIn = new Scanner(System.in);
		String choice = in.nextLine();

		if (choice == "encode") {
			System.out.println("Enter the string to encode:");
			Scanner messageIn = new Scanner(System.in);
			String message = messageIn.nextLine();
			encode(message);
		}
		
		else if (choice == "decode") {
			System.out.println("Enter the string to decode:");
			Scanner messageIn = new Scanner(System.in);
			String message = messageIn.nextLine();
			decode(message);
		}
	}

}
