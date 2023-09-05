package practice.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = number -> number % 2 ==0;

        numbers.stream().filter(isEven).forEach(System.out::println);

    }

}
