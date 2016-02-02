import java.util.Scanner;

public class CaeserCipher {

	public static int[] convertToInts(char[] chArray) {
		int[] intArray = new int[chArray.length];
		int base = (int)'a';
		
		for (int i=0; i<chArray.length; i++) {
			intArray[i] = (int)chArray[i] - base;
		}
		return intArray;
	}
	
	public static char[] encryptOrDecryptChars(char[] charArray, String cryptDir) {
		int[] intArray = convertToInts(charArray.toCharArray());
		int[] newIntArray = new int[charArray.length];
		char[] newCharArray = new char[charArray.length];
		int base = (int)'a';
		
		for (int j=1; j<26; j++) {
			for (int k=0; k<message.length(); k++) {
				if (cryptDir.equals("encrypt")) { int num = (newIntArray[k] + j) % 26; }
				else if (cryptDir.equals("decrypt")) { int num = (newIntArray[k] - j) % 26; }
				newCharArray[k] = (char)(num + base);
				}
			}
		}
		return newCharArray;
	}
	
	
	public static void encrypt(String message) {
		System.out.println("n = 0: " + message);
		char[] encryptedCharArray = encryptOrDecryptChars(message.toCharArray, "encrypt");
		String encryptedString = new String(encryptedCharArray);
		System.out.println("n = " + i + ": " + encryptedString);
	}
	
	public static void decrypt(String message) {
		System.out.println("n = 0: " + message);
		char[] decryptedCharArray = encryptOrDecryptChars(message.toCharArray, "decrypt");
		String decryptedString = new String(decryptedCharArray);
		
		String decryptedString = new String(decryptedCharArray);
		System.out.println("n = " + i + ": " + decryptedString);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("This program encrypts and decrypts messages using the Caeser Cipher.\n Would you like to enccrypt or decrypt a message?");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		
		if (choice.equals("encrypt")) { 
			System.out.println("Enter the string to encrypt:"); 
			String message = in.nextLine();
			encrypt(message);
			}
		else if (choice.equals("decrypt")) { 
			System.out.println("Enter the string to decrypt:"); 
			String message = in.nextLine();
			decrypt(message);
			}
	}

}
