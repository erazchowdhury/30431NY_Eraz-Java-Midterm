package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) throws SQLException {

        Queue<Object> myQueue = new ArrayDeque<>();

        myQueue.add(1);
        myQueue.add(1);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(5);

        System.out.println(myQueue.peek());

        myQueue.remove();
        System.out.println(myQueue);

        myQueue.remove(5);
        System.out.println(myQueue);

        System.out.println(myQueue.poll());

        System.out.println();

        for (Object i: myQueue) {
            System.out.println(i);
        }

        System.out.println();

        Iterator<Object> iterator = myQueue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        SharedStepsDatabase ssdb = new SharedStepsDatabase();

        ssdb.insertQueue("queue", "queue_values", myQueue);

        String query = "SELECT * FROM QUEUE";
        List<String> retrievedQueueAsAList = ssdb.executeQueryReadAllSingleColumn(query, "queue_values");


        for (Object i: retrievedQueueAsAList) {
            System.out.println(i);
        }

        System.out.println();

        Iterator<String> newIterator = retrievedQueueAsAList.iterator();

        while (newIterator.hasNext()) {
            System.out.println(newIterator.next());
        }


    }

}
