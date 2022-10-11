package string_problems;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        numOfDuplicatesAndWordLength(st);

    }

    // Implement here

    public static void numOfDuplicatesAndWordLength(String st) {
        int numOfDuplicates = 1;

        st = st.toLowerCase();

        String[] splitString = st.split(" ");

        int countOfWords = splitString.length;

        for (int i = 0; i < countOfWords; i++){
            for (int j = i + 1; j < countOfWords; j++) {
                if (splitString[i].equals(splitString[j])) {
                    numOfDuplicates++;
                    splitString[j] = "0";
                }
            }
            if (numOfDuplicates > 1 && splitString[i] != "0") {
                System.out.println(splitString[i] + " " + numOfDuplicates);
            }
            numOfDuplicates = 1;
        }

        String sentenceWithoutSpaces = st.replace(" ", "");
        int numOfChars = sentenceWithoutSpaces.length();
        int avgWordLength = numOfChars / countOfWords;

        System.out.println("The average length of each word in the String is " + avgWordLength);

    }

}
