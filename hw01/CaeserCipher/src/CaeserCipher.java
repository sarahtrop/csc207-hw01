
public class CaeserCipher {

	//Encodes a message
	public static void encode(String message) {
		int base = (int) 'a';
		String encryptedMessage;
		
		System.out.println("n = 0: " + message);
		
		for (int i=1; i<26; i++) {
			for (int j=0; j<message.length(); j++) {
				int current = (((int)message.charAt(j)) - base);
				int encryptedNum = (current + i) % 26;
				char encryptedChar = (char) (encryptedNum + base);
				encryptedMessage.charAt(j) = encryptedChar;
			}
			System.out.println("n = " + i + ": " + encryptedMessage);
		}
	}
	
	//Decodes a message
	public static void decode(String message) {
		
	}
	
	public static void main(String[] args) {
		

		
	}

}
