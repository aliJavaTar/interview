package com.test;

public class Text {

    public String rev(String text) {

        if (text.length() == 1)
            return text;

        return rev(text.substring(1)) + text.charAt(0);

    }
}
