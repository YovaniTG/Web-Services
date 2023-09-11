package practice.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {

    public static int[] findTwoNumberSum(int[] array, int targetSum) {
        // Create a HashMap to store the complement of each element
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int currentNum = array[i];
            int complement = targetSum - currentNum;//10 - -1

            // Check if the complement exists in the HashMap
            if (numToIndex.containsKey(complement)) {
                // Return the pair of numbers as an array
                return new int[]{complement, currentNum};
            }

            // Store the current number and its index in the HashMap
            numToIndex.put(currentNum, i);
        }

        // If no pair is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        int[] result = findTwoNumberSum(array, targetSum);

        if (result.length == 2) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No pair found that sums up to the target sum.");
        }
    }
}
