package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");

        String userInput = input.nextLine();
        System.out.println(userInput);
        char[] charactersInString = userInput.toLowerCase().toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();

        for(char character : charactersInString) {
//            count.put(character, 1);
            if(count.containsKey(character)){
                count.put(character, count.get(character)+1);
            } else {
                count.put(character, 1);
            }
        }
        System.out.println(count);
    }

}
