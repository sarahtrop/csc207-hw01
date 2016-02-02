import java.util.Scanner;

public class VigenereCipher {

	public static int[] convertToInts(char[] chArray) {
		int[] intArray = new int[chArray.length];
		int base = (int) 'a';

		for (int i = 0; i < chArray.length; i++) {
			intArray[i] = (int)chArray[i] - base;
		}
		return intArray;
	}

	public static char[] wrapKey(String keyword, int length) {
		char[] keywordCharArray = new char[length];
		for (int l = 0; l < length; l++) {
			keywordCharArray[l] = keyword.charAt(l % keyword.length());
		}
		return keywordCharArray;
	}

	public static char encryptOrDecryptChar(int ch, int keyCh, String cryptDir) {
		int base = (int) 'a';
		int num = 0;

		if (cryptDir.equals("encrypt")) {
			num = (ch + keyCh) % 26;
		} else if (cryptDir.equals("decrypt")) {
			num = (ch - keyCh) % 26;
		}
		char finalChar = (char) (num + base);
		return finalChar;
	}

	public static void encrypt(String message, String key) {
		char[] keyCharArray = wrapKey(key, message.length());
		int[] messageIntArray = convertToInts(message.toCharArray());
		int[] keyIntArray = convertToInts(keyCharArray);
		char[] encryptedCharArray = new char[message.length()];

		for (int j = 0; j < message.length(); j++) {
			encryptedCharArray[j] = encryptOrDecryptChar(messageIntArray[j],
					keyIntArray[j], "encrypt");
		}
		
		String encryptedMessage = "" + encryptedCharArray[0];
		
			if (message.length() > 1) {
				for (int i=1; i<message.length(); i++) {
					encryptedMessage += encryptedCharArray[i];
				}
			}
		System.out.println(encryptedMessage);
	}

	public static void decrypt(String message, String key) {
		char[] keyCharArray = wrapKey(key, message.length());
		int[] messageIntArray = convertToInts(message.toCharArray());
		int[] keyIntArray = convertToInts(keyCharArray);
		char[] decryptedCharArray = new char[message.length()];

		for (int j = 0; j < message.length(); j++) {
			decryptedCharArray[j] = encryptOrDecryptChar(messageIntArray[j],
					keyIntArray[j], "decrypt");
		}

		String decryptedMessage = new String(decryptedCharArray);
		System.out.println(decryptedMessage);
	}

	public static void main(String[] args) {
		System.out.print("This program encrypts and decrypts messages using the Vigenere Cipher.\nWould you like to encrypt or decrypt a message? ");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();

		System.out.print("Enter the string to " + choice + ": ");
		String message = in.nextLine();

		System.out.print("Enter the key: ");
		String key = in.nextLine();

		if (choice.equals("encrypt")) {
			encrypt(message, key);
		} else if (choice.equals("decrypt")) {
			decrypt(message, key);
		}

		in.close();
	}
}
