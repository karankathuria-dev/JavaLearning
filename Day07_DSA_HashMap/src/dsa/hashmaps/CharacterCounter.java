package dsa.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    // Method to count the frequency of each character in a string
    public static Map<Character, Integer> countCharacters(String input) {
        // Create a HashMap to store the characters and their counts
        Map<Character, Integer> charCounts = new HashMap<>();

        // Loop through each character of the input string
        for (char ch : input.toCharArray()) {
            // Traditional if-else approach
            if (charCounts.containsKey(ch)) {
                // If the character is already in the map, increment its count
                int currentCount = charCounts.get(ch);
                charCounts.put(ch, currentCount + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                charCounts.put(ch, 1);
            }

            /*
            // More concise and modern approach using getOrDefault()
            // This does the same thing as the if-else block above, but in one line.
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
            */
        }
        return charCounts;
    }

    public static void main(String[] args) {
        // Test cases for our character counter
        String text1 = "hello world";
        String text2 = "programming is fun";
        String text3 = "google";

        System.out.println("Character counts for \"" + text1 + "\":");
        Map<Character, Integer> counts1 = countCharacters(text1);
        System.out.println(counts1);
        // Expected output for text1: { =1, r=1, e=1, w=1, d=1, h=1, l=3, o=2}

        System.out.println("\nCharacter counts for \"" + text2 + "\":");
        Map<Character, Integer> counts2 = countCharacters(text2);
        System.out.println(counts2);

        System.out.println("\nCharacter counts for \"" + text3 + "\":");
        Map<Character, Integer> counts3 = countCharacters(text3);
        System.out.println(counts3);
    }
}