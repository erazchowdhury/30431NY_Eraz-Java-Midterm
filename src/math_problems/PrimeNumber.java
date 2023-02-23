package math_problems;

import java.util.ArrayList;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {

//        printPrimeNumbers(2, 1_000_000);
        printFirstTenPrimeNumbers();

    }

    public static void printPrimeNumbers (int startOfRange, int endOfRange) {

        int count;

        for (int i = startOfRange; i <= endOfRange; i++) {
            count = 0;

            for (int j = startOfRange; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }

    }

    public static void printFirstTenPrimeNumbers () {

        int count;
        ArrayList<Integer> primeNumbers = new ArrayList();

        for (int i = 2; i <= 30; i++) {
            count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                primeNumbers.add(i);
            }
            if (primeNumbers.size() >= 10){
                break;
            }
        }
        System.out.println(primeNumbers);

    }


}
