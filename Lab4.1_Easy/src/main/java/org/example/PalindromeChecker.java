package org.example;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        String cleanWord = word.replaceAll("\\s+", "").toLowerCase();

        return cleanWord.equals(new StringBuilder(cleanWord).reverse().toString());
    }

    public static void main(String[] args) {
        String testWord = "level";
        System.out.println(testWord + " is a palindrome: " + isPalindrome(testWord));

        testWord = "hello";
        System.out.println(testWord + " is a palindrome: " + isPalindrome(testWord));
    }
}
