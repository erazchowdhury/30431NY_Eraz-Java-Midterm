package math_problems;

public class UnitTestingMath {

    /**
     * Use this class to unit test all of the class within this package
     */

    public static void main(String[] args) {

        int[] array1 = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};

        int[] array2 = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};

        System.out.println(Factorial.getFactorialRecursion(5));
        System.out.println(Factorial.getFactorialIteration(6));
        System.out.println(Fibonacci.getFibonacci(10));
        System.out.println(FindMissingNumber.findMissingNumber(array1));
        System.out.println(LowestNumber.findLowestNumber(array2));

        PrimeNumber.printPrimeNumbers(2, 20);

    }
}
