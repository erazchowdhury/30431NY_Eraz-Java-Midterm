package data_structures;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {

        List<Integer> data =  new ArrayList<>();

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

    }

}
