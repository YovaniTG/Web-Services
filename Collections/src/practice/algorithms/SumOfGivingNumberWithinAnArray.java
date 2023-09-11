package practice.algorithms;

import java.util.*;

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
public static  HashMap <Integer, Integer> fillHashMap (TreeSet<Integer> uniqueList, int sumInput){
    HashMap <Integer, Integer> mappedNumbers = new HashMap<>();
    if (sumInput != 0){
        for (Integer element: uniqueList){
            mappedNumbers.put(element,0);
        }
    }
    return mappedNumbers;
}


    public static int [] arraySum(TreeSet<Integer> uniqueList, int sumInput){

        HashMap <Integer, Integer> mappedNumbers = fillHashMap( uniqueList, sumInput);

        if (sumInput != 0){
            for (Integer element: uniqueList){
                int component = sumInput - element;

                if (mappedNumbers.containsKey(component)){
                    return new int[]  {component, element};
                }


            }
        }

        return new int[]{};

    }

    public static void main(String[] args) {

        int sumInput = 11;
        List<Integer> originalInput = Arrays.asList(3, 5, -4, 8, 11, 1,1, -1, 6,6);
        TreeSet<Integer> uniqueList = new TreeSet<>(originalInput);

        int [] outPutArray = arraySum(uniqueList, sumInput);

        for (int i =0; i < outPutArray.length; i++){
            System.out.println(outPutArray[i]);
        }



    }
}
