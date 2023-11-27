package Contests.Module2;

import java.util.*;

public class Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        int rotation = 4;

        String encryptedText = encryptCaesar(userInput, rotation);


        System.out.println(encryptedText);


        scanner.close();
    }

    public static String encryptCaesar(String input, int rotation) {
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char encryptedChar = (char) ((ch - base + rotation) % 26 + base);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(ch);
            }
        }

        return encryptedText.toString();
    }
}
