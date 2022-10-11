package math_problems;

import java.util.Arrays;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        lowestNotShared(array1, array2);

    }

    public static void lowestNotShared (int[] array1, int[] array2) {

        int a1 = array1.length;
        int a2 = array2.length;
        int a3 = a1 + a2;

        int[] array3 = new int[a3];

        for (int i = 0; i < a1; i++){
            array3[i] = array1[i];
        }

        for (int i = 0; i < a2; i++){
            array3[a1 + i] = array2[i];
        }

        Arrays.sort(array3);



        System.out.println(Arrays.toString(array3));

    }

}
