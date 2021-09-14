package com.ds.algo.challange.PopularPrograms;

/**
 * @Author pankaj
 * @create 9/14/21 11:52 AM
 */
public class SumOfAllDigitsOfANumber {
    static void sumOfAllDigits(int inputNumber) {
        //Creating a copy of input number

        int copyOfInputNumber = inputNumber;
        int sum = 0;
        while (copyOfInputNumber != 0) {
            int lastDigit = copyOfInputNumber % 10;
            sum = sum + lastDigit;
            copyOfInputNumber = copyOfInputNumber / 10;
        }
        System.out.println("sum of all the digits from " + inputNumber + " = " + sum);
    }

    public static void main(String[] args) {
        sumOfAllDigits(123);
    }
}