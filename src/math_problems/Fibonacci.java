package math_problems;

import java.util.LinkedList;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {

        System.out.println(getFibonacci(10));

    }

    public static LinkedList getFibonacci (int num) {

        int num1 = 0;
        int num2 = 1;

        int counter = 0;

        LinkedList<Integer> fibonacciList = new LinkedList<>();

        while (counter < num){
            fibonacciList.add(num1);

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }

        return fibonacciList;
    }

}
