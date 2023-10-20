package org.example;

public class With {
    public static StringBuilder Contains (String input) {
        StringBuilder matchedvalues = new StringBuilder();
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            if (matchedvalues.toString().contains("" + inputArray[i])) {}
            else {
                matchedvalues.append(inputArray[i]);
            }
        }
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            if (matchedvalues.toString().contains("" + alphabet)) {}
            else {
                matchedvalues.append(alphabet);
            }
        }
        return matchedvalues;
    }
    public static StringBuilder Something (String input) {
        StringBuilder matchedvalues = new StringBuilder();
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            boolean found = false;
            for (int j = 0; j < matchedvalues.length(); j++) {
                if (matchedvalues.charAt(j) == inputArray[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                matchedvalues.append(inputArray[i]);
            }
        }
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            boolean found = false;
            for (int j = 0; j < matchedvalues.length(); j++) {
                if (matchedvalues.charAt(j) == alphabet) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                matchedvalues.append(alphabet);
            }
        }
        return matchedvalues;
    }
}
