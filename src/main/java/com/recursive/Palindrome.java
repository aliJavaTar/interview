package com.recursive;

public class Palindrome {

    // level -> level -> l l -> e e -> v
    // moom -> m m -> o o

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("abc"));
    }
}
