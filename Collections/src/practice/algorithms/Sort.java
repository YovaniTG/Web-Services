package practice.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {


    public static List<Integer> sort(List<Integer> numbers){

        for (int numbPos = 0; numbPos < numbers.size(); numbPos++){

            System.out.println("numbPos"+ numbPos);


            for (int currentPos = 0; currentPos < numbers.size() -1; currentPos++){

                int temp2 = numbers.get(currentPos +1);


                System.out.println("" + numbers.get(currentPos) + " es mayor que: " + temp2);

                if (numbers.get(currentPos) > temp2 ){
                    int temp= numbers.get(currentPos);
                    int nextPos = currentPos + 1;
                    numbers.set(currentPos, temp2);
                    numbers.set(nextPos, temp);


                }

            }

        }


        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(7,3,9,1,3,10,12,54,2,78));

        sort(numbers).stream().forEach(System.out::println);

    }
}
