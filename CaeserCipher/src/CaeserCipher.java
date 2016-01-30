import java.util.Scanner

public class CaeserCipher {

	//Encodes a message
	public static void encode(String message) {
		int base = (int) 'a';
		char[] encryptedChars = new char[message.length()];
		String encryptedString;
		
		//Printing original message
		System.out.println("n = 0: " + message);
		
		//Encoding message using n 1-25
		for (int i=1; i<26; i++) {
			for (int j=0; j<message.length(); j++) {
				//encrypting character
				int current = (((int)message.charAt(j)) - base);
				int encryptedNum = (current + i) % 26;
				char encryptedChar = (char) (encryptedNum + base);
				//adding encrypted character to a new string
				encryptedChars[j] = encryptedChar;
			}
			//printing the new encrypted string
			encryptedString = new String(encryptedChars);
			System.out.println("n = " + i + ": " + encryptedString);
		}
	}
	
	//Decodes a message
	public static void decode(String message) {
		int base = (int) 'a';
		char[] decryptedChars = new char[message.length()];
		String decryptedString;
		
		//Printing original message
		System.out.println("n = 0: " + message);
		
		//Decoding message using n 1-25
		for (int i=1; i<26; i++) {
			for (int j=0; j<message.length(); j++) {
				//decrypting character
				int current = (((int)message.charAt(j)) - base);
				int decryptedNum = (current - i) % 26;
				char decryptedChar = (char) (decryptedNum + base);
				//adding encrypted character to a new string
				decryptedChars[j] = decryptedChar;
			}
			
			//printing the new decrypted string
			decryptedString = new String(decryptedChars);
			System.out.println("n = " + i + ": " + decryptedString);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("This program encrypts and decrypts messages using the Caeser Cipher.\n Would you like to encode or decode a message?");
		Scanner choiceIn = new Scanner(System.in);
		String choice = in.nextLine();
		
		System.out.println("Enter the string to encode:");
		Scanner messageIn = new Scanner(System.in);
		String message = in.nextLine();
		
		if (choice == "encode")
			encode(message);
		else if (choice == "decode")
			decode(message);
	}

}
