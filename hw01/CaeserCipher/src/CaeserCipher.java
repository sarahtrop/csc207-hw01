
public class CaeserCipher {

	//Encodes a message
	public static void encode(String message) {
		int base = (int) 'a';
		String[] encryptedMessage;
		
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
				encryptedMessage[j] = encryptedChar;
			}
			//printing the new encrypted string
			System.out.println("n = " + i + ": " + encryptedMessage);
		}
	}
	
	//Decodes a message
	public static void decode(String message) {
		int base = (int) 'a';
		String[] decryptedMessage;
		
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
				decryptedMessage[j] = decryptedChar;
			}
			//printing the new decrypted string
			System.out.println("n = " + i + ": " + decryptedMessage);
		}
	}
	
	public static void main(String[] args) {
		String choice;
		String message;
		
		System.out.println("This program encrypts and decrypts messages using the Caeser Cipher.\n Would you like to encode or decode a message?");
		//GET WORD TO DETERMINE ENCODE OR DECODE
		System.out.println("Enter the string to encode:") //GET MESSAGE TO ENCODE OR DECODE
		
		if (choice == "encode")
			encode(message);
		else if (choice == "decode")
			decode(message);
	}

}
