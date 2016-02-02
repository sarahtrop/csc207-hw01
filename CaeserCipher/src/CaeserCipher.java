import java.util.Scanner;

public class CaeserCipher {

	public static int[] convertToInts(char[] chArray) {
		int[] intArray = new int[chArray.length];
		int base = (int) 'a';

		for (int i = 0; i < chArray.length; i++) {
			intArray[i] = (int) chArray[i] - base;
		}
		return intArray;
	}

	public static char[] encryptOrDecryptChars(char[] charArray, String cryptDir, int itr) {
		int[] intArray = convertToInts(charArray);
		char[] newCharArray = new char[charArray.length];
		int base = (int) 'a';
		int num = 0;

		for (int k = 0; k < intArray.length; k++) {
			if (cryptDir.equals("encrypt")) {
				num = (intArray[k] + itr) % 26;
			} else if (cryptDir.equals("decrypt")) {
				num = (intArray[k] - itr) % 26;
			}
			newCharArray[k] = (char) (num + base);
		}
		return newCharArray;
	}

	public static void printIteration (String str, int itr) {
		System.out.println("n = " + itr + ": " + str);
	}
	
	public static void encrypt(String message) {
		System.out.println("n = 0: " + message);
		
		for (int j = 1; j <26; j++) {
			char[] encryptedCharArray = encryptOrDecryptChars(message.toCharArray(),
					"encrypt", j);
			String encryptedMessage = "" + encryptedCharArray[0];
			if (message.length() > 1) {
				for (int i=1; i<message.length(); i++) {
					encryptedMessage += encryptedCharArray[i];
				}
			}
			printIteration(encryptedMessage, j);
		}
	}

	public static void decrypt(String message) {
		System.out.println("n = 0: " + message);
		
		for (int j = 1; j<26; j++) {
			char[] decryptedCharArray = encryptOrDecryptChars(message.toCharArray(),
					"decrypt", j);
			String decryptedMessage = "" + decryptedCharArray[0];
			if (message.length() > 1) {
				for (int i=1; i<message.length(); i++) {
					decryptedMessage += decryptedCharArray[i];
				}
			}
			printIteration(decryptedMessage, j);
		}
	}

	public static void main(String[] args) {

		System.out.print("This program encrypts and decrypts messages using the Caeser Cipher.\nWould you like to encrypt or decrypt a message? ");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		System.out.print("Enter the string to " + choice + ": ");
		String message = in.nextLine();

		if (choice.equals("encrypt")) {
			encrypt(message);
		} else if (choice.equals("decrypt")) {
			decrypt(message);
		}
		in.close();
	}

}
