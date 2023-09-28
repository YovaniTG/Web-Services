package practice.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr, int n) {
        Collections.sort(arr);
        HashMap<String, Integer> mappedValues = new HashMap<>();
        mappedValues.put("Negative", 0);
        mappedValues.put("Positive", 0);
        mappedValues.put("Zero", 0);


        for (Integer currentNumber : arr) {
            if(currentNumber < 0 && currentNumber != 0){//Negative number
                mappedValues.put("Negative", mappedValues.get("Negative")+ 1);
            }
            if(currentNumber > 0 && currentNumber != 0){ //Positive number
                mappedValues.put("Positive", mappedValues.get("Positive")+ 1);
            }
            if(currentNumber == 0){
                mappedValues.put("Zero", mappedValues.get("Zero")+ 1); //only zeros
            }
        }

        System.out.println(mappedValues.get("Negative"));
       // float result = Math.divideExact((int) mappedValues.get("Negative"), n);
      //  System.out.println(result);
        System.out.println(mappedValues.get("Positive")/ n);
        System.out.println(mappedValues.get("Zero")/ n);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr, n);

        bufferedReader.close();
    }
}