import java.util.Scanner;

public class CaesarCipher {

  String cipher(String message, int offset) {
    // To hold the cipher text
    StringBuilder result = new StringBuilder();

    // Character by character encryption
    for (char character : message.toCharArray()) {
      if (character != ' ') {
        int originalAlphabetPosition = character - 'a';

        // Applying Caesar Cipher Technique
        int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
        char newCharacter = (char) ('a' + newAlphabetPosition);

        // Adding the new character to the result
        result.append(newCharacter);
      } else {
        result.append(character);
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CaesarCipher cipher = new CaesarCipher();

    int offset = sc.nextInt();

    String cipheredMessage = cipher.cipher(
      "I enjoy learning from scalar topics",
      offset
    );
    System.out.println(cipheredMessage);
  }
}
