package string_problems;

public class UnitTestingStringProblem {

    /**
     Use this class to unit test all of the classes contained within this package
     */

    public static void main(String[] args) {

        Anagram.isAnagram("raft", "fart");

        System.out.println(DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine"));

        DuplicateWord.numOfDuplicatesAndWordLength("Java is a programming Language. Java is also an Island of " +
                "Indonesia. Java is widely used language");

        System.out.println(Palindrome.isPalindrome("MOM"));

    }
}
