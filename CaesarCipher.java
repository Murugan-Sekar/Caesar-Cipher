import java.util.*; 
import java.io.*;

public class CaesarCipher {

	static String caesar(String value, int shift) {
		char[] buffer = value.toCharArray();
		for (int i = 0; i<buffer.length; i++) {
			char letter = buffer[i];
			letter = (char) (letter + shift);
			if (letter > 'z') {
				letter = (char) (letter - 26);
			} else if (letter < 'a') {
				letter = (char) (letter + 26);
			}
			buffer[i] = letter;
		}
		return new String(buffer);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter  Plain text: ");
		String a = reader.next();
		System.out.print("Enter  key size: ");
		int n = reader.nextInt();
		System.out.print("\nEncrypted Text: ");
		String b = caesar(a, n);
		System.out.println(b);
		System.out.print("\nDecrypted Text: ");
		String e = caesar(b,-n);
		System.out.println(e);
	}

}
