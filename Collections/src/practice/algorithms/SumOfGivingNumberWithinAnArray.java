package practice.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SumOfGivingNumberWithinAnArray {

    /*
    Write a function that takes in a non-empty array of distinct integers, and an integer representing a target sum.
    If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order.
    If no two numbers sum up to the target sum, the function should return an empty array.

    Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single integer itself in order
    to obtain the target sum
    You can assume that there will be at most one pair of numbers summing up to the target sum.
    array = [3, 5, -4, 8, 11, 1, -1, 6]
    targetSum = 10
    Sample Output
    [-1,11]
     */

    public static void arraySum(HashSet<Integer> arrayInput, int sumInput){
        int outputArray[] = new int[2];//added an array since i know the output will always be of two numbers.

        if (sumInput != 0){
            for (Integer element: arrayInput){

            }
        }



    }

    public static void main(String[] args) {

        int sumInput = 10;
        List<Integer> originalInput = Arrays.asList(3, 5, -4, 8, 11, 1, -1, 6);
        HashSet<Integer> arrayInput = new HashSet<>(originalInput);



    }
}
