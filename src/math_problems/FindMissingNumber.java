package math_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};

        System.out.println(findMissingNumber(array));

    }

    public static int findMissingNumber (int[] arr) {

        int length = arr.length;

        int sum = ((length + 1) * (length + 2)) / 2;
        for (int i = 0; i < length; i++)
            sum -= arr[i];

        return sum;

    }

}
