package string_problems;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    public static void main(String[] args) {

        System.out.println(getPermutation("ABC"));

    }
    // Implement Here

    public static Set<String> getPermutation(String str) {

        Set<String> permutation = new HashSet<>();

        int length = str.length();

        if (str == null) {
            return null;
        } else if (length == 0) {
            permutation.add("");
            return permutation;
        }

        char firstChar = str.charAt(0);

        String ros = str.substring(1);

        Set<String> restOfWords = getPermutation(ros);

        for (String newString : restOfWords) {
            for (int i = 0; i <= newString.length(); i++) {

                permutation.add(newString.substring(0, i) + firstChar + newString.substring(i));

            }
        }
        return permutation;
    }

}
