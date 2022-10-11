package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {

        System.out.println(getFactorialRecursion(5));
        System.out.println(getFactorialIteration(6));

    }

    public static int getFactorialRecursion (int num) {

        if(num >= 1) {
            return num * getFactorialRecursion(num - 1);
        } else {
            return 1;
        }

    }

    public static int getFactorialIteration (int num) {

        int factorial = 1;
        if (num > 1) {
            for (int i = 1; i <= num; i++){
                factorial *= i;
            }
            return factorial;
        } else {
            return factorial;
        }

    }


}
