package com.ds.algo.challange.PopularPrograms;

/**
 * @Author pankaj
 * @create 9/14/21 11:23 AM
 */
// Armstrong number if it is equal to sum of its digits each raised to the power of number of digits in it. For example: 153, 371, 407, 9474, 54748 are some Armstrong numbers.
/*    First we create a copy of the given number as ‘copyOfNumber‘. We find out the number of digits in a given number and store it into a variable called ‘noOfDigits‘. For this, we use String.valueOf(number).length() which gives the number of digits in a given number. We also declare a variable ‘sum’ and initialize it to 0.

            We extract each and every digit of a given number from last to first in a while loop. For this we use ‘%’ – Modulus operator. You may know that, if we use modulus operator like number%10, it will give last digit of the number. After getting last digit of the number, we multiply it by itself equal to ‘noOfDigits’ times, store it into ‘lastDigitToThePowerOfNoOfDigits’ and add it to ‘sum’.

            After calculating ‘lastDigitToThePowerOfNoOfDigits’ and adding it to ‘sum’, we divide the ‘copyOfNumber‘ by 10 i.e copyOfNumber/10. It will remove the last digit from the number. We continue these steps until ‘copyOfNumber‘ becomes 0.

            At last, we check whether ‘sum’ is equal to given number. If it is equal, then given number is an Armstrong number.*/
public class ArmstrongNumber {
    static void checkArmstrongNumber(int number) {
        int copyOfNumber = number;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;
        while (copyOfNumber != 0) {
            int lastDigit = copyOfNumber % 10;
            int lastDigitToThePowerOfNoOfDigits = 1;
            for(int i = 0; i < noOfDigits; i++)
            {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
            }
            sum = sum + lastDigitToThePowerOfNoOfDigits;

            copyOfNumber = copyOfNumber / 10;
        }

        if (sum == number)
        {
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            System.out.println(number+" is not an armstrong number");
        }
    }

    public static void main(String[] args)
    {
        checkArmstrongNumber(153);

        checkArmstrongNumber(371);

        checkArmstrongNumber(9474);

        checkArmstrongNumber(54748);

        checkArmstrongNumber(407);

        checkArmstrongNumber(1674);
    }
}
