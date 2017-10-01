package uk.ac.bmth.aprog.task01;

import java.io.PrintStream;
import java.util.Scanner;

public class Task01 {

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5,
     * we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * <p>
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */

  /*  private static void problem1() {
        System.out.println("Problem 1:");
        System.out.println("==========");

        int sum = 0;
        int multiplesOfThree = 3;
        int multiplesOfFive = 5;

        for (int i = 0; i < 1000; i++) {
            if (i % multiplesOfThree == 0 || i % multiplesOfFive == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum: " + Integer.toString(sum));
    } */
/*
    /**
     * Write a program that that asks for a number to be input, and then lists
     * all prime numbers up to that number.
     */
    private static void problem2() {
        System.out.println("Problem 2:");
        System.out.println("==========");

        Scanner usrInput = new Scanner(System.in);
        int usrNum;
        int count;
        String primeNumbers = "";

        System.out.println("Enter an integer: ");
        usrNum = usrInput.nextInt();
        usrInput.close();

        for (int i = 1; i <= usrNum; i++) {
            count =0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                  count++;
                }
            }
            if (count == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }

            System.out.println("The prime numbers up to your integer are: ");
            System.out.println(primeNumbers);
    }

        /**
         * A gambling company requires that you select six different numbers from
         * the integers 1 to 49 to make up a full lottery number.  Each number can
         * only appear once in a given lottery number.  Write a program to do this and
         * use it to generate five lottery numbers (ie five sets of 6 numbers).
         */
  /*  private static void problem3() {
        System.out.println("Problem 3:");
        System.out.println("==========");

        // TODO Implement problem 3

        // output should be a list of five lottery numbers, each containing 6 integers
    }

    *//**
         * Write a program to display a rectangular multiplication table.  It should
         * look like the example below.  Do not just use a succession of hard-coded
         * output statements – you should be using loops.
         *
         * @see {@link PrintStream#printf(String, Object...)}
         *//*
    private static void problem4() {
        System.out.println("Problem 4:");
        System.out.println("==========");

        // TODO Implement problem 4

        // output should be a table of numbers (make sure they line up properly
    }


    *//**
         * Write a program that asks you to input a short sentence, and then displays
         * it having reversed the sequence of letters in each word of your chosen
         * sentence of text.  For instance, "To be or not to be." becomes "oT eb ro ton ot eb."
         *//*
    private static void problem5() {
        System.out.println("Problem 5:");
        System.out.println("==========");

        // TODO Implement problem 5
    }


    */

        /**
         * Write a program which will ask the user to input a value for min, and a value for max,
         * and also a paragraph of text.  It should then output a list of all of the sentences
         * within the paragraph, along with the length of that sentence, where their length is:
         * min <= length <= max.
         * It should also output the number of proper characters, the number of (actual) spaces
         * and also the number of punctuation symbols for the whole paragraph.
         * <p>
         * •	Assume that a sentence ends in a period, question mark, or exclamation point.
         * •	Assume that the sentence does not contain any quotation marks (apostrophes are allowed).
         * •	The length of the sentence includes all spaces and punctuation.
         * •	Min and Max should be positive integers less than 1000, and Min <= Max.  The program should check for this.
         *//*
    private static void problem6() {
        System.out.println("Problem 6:");
        System.out.println("==========");

        // TODO Implement problem 6

    }*/

    public static void main(String[] args) {
       // problem1();
        System.out.println();
        problem2();
        System.out.println();
       // problem3();
        System.out.println();
       // problem4();
        System.out.println();
        //problem5();
        System.out.println();
        //problem6();
    }
}
