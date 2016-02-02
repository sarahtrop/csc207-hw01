import java.util.Scanner;

public class VigenereCipher {

	public static int[] convertToInts(char[] chArray) {
		int[] intArray = new int[chArray.length];
		int base = (int)'a';
		
		for (int i=0; i<chArray.length; i++) {
			intArray[i] = (int)chArray[i] - base;
		}
		return intArray;
	}
	
	public static char[] wrapKey(String keyword, int length) {
		char[] keywordCharArray = new char[length];
		for (int l=0; l<length; l++) {
			keywordCharArray[l] = keyword.charAt(l % keyword.length());
		}
		return keywordCharArray;
	}
	
	public static char encryptOrDecryptChar(int ch, int keyCh, String cryptDir) {
		int base = (int)'a';
		
		if (cryptDir.equals("encrypt")) { int num = ch + keyCh; }
		else if (cryptDir.equals("decrypt")) { int num = ch - keyCh; }
		
		char finalChar = (char)(num + base);
		return finalChar;
	}
	
	public static void encrypt(String message, String key) {
		char[] keyCharArray = wrapKey(key, message.length());
		int[] messageIntArray = convertToInts(message.toCharArray());
		int[] keyIntArray = convertToInts(keyCharArray);
		char[] encryptedCharArray = new char[message.length()];
		
		for (int j=0; j<message.length(); j++) {
			encryptedCharArray[j] = encryptOrDecryptChar(messageIntArray[j], keyIntArray[j], "encrypt");
		}
		
		String encryptedMessage = encryptedCharArray.toString();
		System.out.println(encryptedMessage);
	}
	
	public static void decrypt(String message, String key) {
		char[] keyCharArray = wrapKey(key, message.length());
		int[] messageIntArray = convertToInts(message.toCharArray());
		int[] keyIntArray = convertToInts(keyCharArray);
		char[] decryptedCharArray = new char[message.length()];
		
		for (int j=0; j<message.length(); j++) {
			decryptedCharArray[j] = encryptOrDecryptChar(messageIntArray[j], keyIntArray[j], "decrypt");
		}
		
		String decryptedMessage = new String(decryptedCharArray);
		System.out.println(decryptedMessage);
	}
	
	public static void main(String[] args) {
		System.out.println("This program encrypts and decrypts messages using the Vigenere Cipher.\nWould you like to encode or decode a message?");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();

		
		if (choice.equals("encrypt")) { System.out.println("Enter the string to encrypt:"); }
		else if (choice.equals("decrypt")) { System.out.println("Enter the string to decrypt:"); }
		String message = in.nextLine();
		
		System.out.println("Enter the key:");
		String key = in.nextLine();
		
		if (choice.equals("encrypt")) { encrypt(message, key); }
		else if (choice.equals("decrypt")) { decrypt(message, key); }
		}
	}

}
