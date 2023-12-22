package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        if (word.length < postfix.length) {
            return false;
        }

        for (int i = word.length - 1, j = postfix.length - 1; j >= 0; i--, j--) {
            if (word[i] != postfix[j]) {
                return false;
            }
        }
        return true;
    }
}
