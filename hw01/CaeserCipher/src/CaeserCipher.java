
public class CaeserCipher {

	//Encodes a message
	public static void encode(String message) {
		int base = (int) 'a';
		
		for (int i=0; i<26; i++) {
			for (int j=0; j<message.length(); j++) {
				int current = (((int)message.charAt(j)) - base);
				int encryptedNum = (current + i) % 26;
				char encryptedChar = (char) (encryptedNum + base);
			}
			
		}
	}
	
	//Decodes a message
	public static void decode(String message) {
		
	}
	
	public static void main(String[] args) {
		

		
	}

}
