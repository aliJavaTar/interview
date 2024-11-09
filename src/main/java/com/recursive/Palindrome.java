package com.recursive;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        int right = 0, left = s.length() - 1;
        while (right < left) {
            if (s.charAt(right) != s.charAt(left))
                return false;
            right++;
            left--;
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        if (s.isEmpty())
            return true;
        return isValid(s, 0, s.length() - 1);
    }

    public static boolean isValid(String s, int left, int right) {
        if (left >= right)
            return true;
        if (s.charAt(left) != s.charAt(right))
            return false;

        return isValid(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        boolean ali = isPalindrome2("ali");
        System.out.println(ali);
        System.out.println(isPalindrome2("dccd"));
    }
}
