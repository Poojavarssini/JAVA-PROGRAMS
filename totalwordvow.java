package practice;

import java.util.*;
public class totalwordvow {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str= inp.nextLine();
        int wCount = str.split("\\s+").length;
        System.out.println("Number of words in the sentence: " + wCount);
        int vowelCount = 0;
        String[] words = str.split("\\s+");
        for (String word : words) {
            int wordVowelCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (isVowel(c)) {
                    wordVowelCount++;
                    vowelCount++;
                }
            }
            System.out.println("Number of vowel letters in \"" + word + "\": " + wordVowelCount);
        }
        System.out.println("Number of vowels in the sentence: " + vowelCount);

    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}