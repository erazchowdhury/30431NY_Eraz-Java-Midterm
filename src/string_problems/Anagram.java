package string_problems;

import java.util.Arrays;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here

    public static boolean isAnagram (String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("IS NOT AN ANAGRAM");
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] newCharArr1 = str1.toCharArray();
        char[] newCharArr2 = str2.toCharArray();

        Arrays.sort(newCharArr1);
        Arrays.sort(newCharArr2);

        if (Arrays.equals(newCharArr1, newCharArr2)) {
            System.out.println("IS AN ANAGRAM");
            return true;
        }

        System.out.println("IS NOT AN ANAGRAM");
        return false;
    }

}
