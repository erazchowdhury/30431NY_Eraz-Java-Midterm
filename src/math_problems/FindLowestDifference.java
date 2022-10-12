package math_problems;

import java.util.*;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        System.out.println(lowestUncommon(array1, array2));

    }

    public static int lowestUncommon(int[] array1, int[] array2) {

        Arrays.sort(array1);
        Arrays.sort(array2);

        List<Integer> list1 = new ArrayList<>();
        for (int i : array1)
        {
            list1.add(i);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i : array2)
        {
            list2.add(i);
        }

        List<Integer> union = new ArrayList<>(list1);
        union.addAll(list2);

        List<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);

        union.removeAll(intersection);

        return union.get(0);

    }

}
