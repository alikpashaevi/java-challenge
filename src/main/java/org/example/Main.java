package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array element count

        System.out.println("Enter number of array: ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        int elemCount = 0;
        System.out.println("Enter numbers one by one: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter number to count: ");
        int target = scanner.nextInt();
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] == target) {
                elemCount++;
            }
        }
        System.out.println("The number is " + elemCount + " times");

//         Palindrome checker

        System.out.print("enter a word: ");
        String word = scanner.next();

        word = word.toLowerCase().replaceAll("\\s", "");
        String reversedWord = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        if (reversedWord.equals(word)) {
            System.out.println("The word is palindrome");
        } else {
            System.out.println("The word isn't palindrome");
        }

//        ARRAY INDEX BOUNDS CHECKER

        System.out.println("Enter number of array: ");
        int anotherSize = scanner.nextInt();
        int[] anotherArr = new int[anotherSize];
        System.out.println("Enter numbers one by one: ");
        for (int i = 0; i < anotherSize; i++) {
            anotherArr[i] = scanner.nextInt();
        }

        System.out.println("Enter index number: ");
        int indexNum = scanner.nextInt();
        try {
            System.out.println("the nubmer at index " + indexNum + " is " + anotherArr[indexNum]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("the index "+ indexNum + " is out of bounds");
        }

        // WORD COUNTER WITH SPACES

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int wordCount = sentence.trim().split(" ").length;
        System.out.println("Number of words in the sentence: " + wordCount);

        // WORD COUNTER WITH SPACES AND COMMAS
        System.out.print("Enter a sentence: ");
        String anotherSentence = scanner.nextLine();

        // ან ერთი ან მეორეს გათვალისწინებით
        int anotherCount = anotherSentence.trim().replaceAll(" ", ",").split(",").length;
        System.out.println("Number of words in the sentence: " + anotherCount);

        // ორივეს გათვალისწინებით
//        int anotherCount = anotherSentence.trim().split("[,\\s]+");
    };
}
