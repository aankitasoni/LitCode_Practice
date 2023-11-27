package Contests.Module1;

import java.util.*;

public class Goat_Latin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSentence = scanner.nextLine();
        String goatLatinResult = convertToGoatLatin(inputSentence);
        System.out.println(goatLatinResult);
    }

    private static String convertToGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isVowel(word.charAt(0))) {
                result.append(word).append("ma");
            } else {
                result.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }

            for (int j = 0; j <= i; j++) {
                result.append("a");
            }


            result.append(" ");
        }


        return result.toString().trim();
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
