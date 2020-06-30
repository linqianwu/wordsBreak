package com.util;

import java.util.HashSet;
import java.util.Set;

public class WordBreakUtil {

    public static void wordBreak(String word) {
        wordBreakUtil(word, word.length(), "");
    }

    private static void wordBreakUtil(String word, int length, String result) {

        for(int i=1; i<=length; i++)
        {
            String prefix = word.substring(0, i);
            if (dictionaryContains(prefix))
            {
                if (i == length)
                {
                    result += prefix;
                    System.out.println(result);
                    return;
                }
                wordBreakUtil(word.substring(i, length), length-i, result + prefix + " ");
            }
        }
    }

    private static boolean dictionaryContains(String prefix) {
        String dictionary[] = { "i", "like", "sam", "sung","samsung","mobile","ice","cream","and","mango","man","go" };
        int n = dictionary.length;
        for (int i = 0; i < n; i++)
            if (dictionary[i].compareTo(prefix) == 0)
                return true;
        return false;
    }

}

