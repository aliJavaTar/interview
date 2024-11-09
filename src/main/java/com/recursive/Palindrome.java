package com.recursive;

public record Palindrome(String word) {

    // level -> level -> l l -> e e -> v
    // moom -> m m -> o o

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
    // two pointer algorithm         -->  loop  --> big O ( n ^ 2)
    // start index  end index -->
    private static final int START_INDEX = 0;

    public boolean isValid() {
        if (word.length() < 2)
            return true;

        return isPalindrome(word, START_INDEX, getEndIndex());

    }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("abc"));
    public int getEndIndex() {
        return word.length() - 1;
    }

    private boolean isPalindrome(String text, int startIndex, int endIndex) {

        if (startIndex >= endIndex)
            return true;

        if (text.charAt(startIndex) != text.charAt(endIndex))
            return false;

        return isPalindrome(text, startIndex + 1, endIndex - 1);
    }
}
