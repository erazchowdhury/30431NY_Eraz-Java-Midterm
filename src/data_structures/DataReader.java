package data_structures;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

    /** INSTRUCTIONS
     *
     * Create an API to read the .txt file and print it to the console.
     *      HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     *
     * Store and retrieve the file to/from a database table.
     *
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     *
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) {
        String textFilePath = System.getProperty("user.dir") + "/src/data_structures/data/self-driving-car";
        File file = new File(textFilePath);

        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)){

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            List<String> fileAsALinkedList = new LinkedList<>();
            Stack<String> fileAsAStack = new Stack<>();

            while ((line = br.readLine()) != null) {
                String[] splitSentence = line.split(" ");
                for (String string : splitSentence) {
                    fileAsALinkedList.add(string);
                    fileAsAStack.push(string);
                }
            }

//            for (String string : fileAsALinkedList) {
//                System.out.print(string + " ");
//            }

//            Iterator<String> iterator = fileAsALinkedList.iterator();
//            while (iterator.hasNext()) {
//                System.out.print(iterator.next() + " ");
//            }

//            for (String string : fileAsAStack) {
//                System.out.print(string + " ");
//            }

//            Iterator<String> iterator2 = fileAsAStack.iterator();
//            while (iterator2.hasNext()) {
//                System.out.print(iterator2.next() + " ");
//            }

        } catch (FileNotFoundException e) {
            System.out.println("NO FILE EXISTS AT THE PROVIDED PATH!");
        } catch (IOException e) {
            System.out.println("COULD NOT READ FROM FILE. PLEASE CHECK YOUR FILE IS NOT CORRUPTED");
        }

    }

}
