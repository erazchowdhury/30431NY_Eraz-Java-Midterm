package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {

        printPrimeNumbers(2, 1_000_000);

    }

    public static void printPrimeNumbers (int start, int end) {

        int counter;

        for (int i = start; i <= end; i++) {
            counter = 0;

            for (int j = start + 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    counter++;
                    break;
                }
            }

            if (counter == 0) {
                System.out.println(i);
            }
        }

    }


}
