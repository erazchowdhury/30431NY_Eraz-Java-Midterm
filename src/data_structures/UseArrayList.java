package data_structures;

import databases.SharedStepsDatabase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) throws Exception{

        List<Object> data =  new ArrayList<>();

        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

        System.out.println(data);

        data.add(10);
        System.out.println(data);
        data.remove(5);
        System.out.println(data);

        System.out.println(data.get(0));

        System.out.println();

        for (Object i: data) {
            System.out.println(i);
        }

        System.out.println();

        Iterator<Object> iterator = data.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        SharedStepsDatabase ssdb = new SharedStepsDatabase();

        ssdb.insertList("array_list", "array_list_values", data);

        String query = "SELECT * FROM ARRAY_LIST";
        List<String> retrievedArrayList = ssdb.executeQueryReadAllSingleColumn(query, "array_list_values");

        for (String value : retrievedArrayList) {
            System.out.println(value);
        }

    }

}
