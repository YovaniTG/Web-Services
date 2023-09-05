package practice.algorithms;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {


    public static void main(String[] args) {
        Consumer<String> printConsumer = (str) -> System.out.println(str);//consumer using lambdas
        Consumer<String> methodReferenceConsumer = System.out::println;// consumer using method reference
        printConsumer.accept("lambda consumer");
        methodReferenceConsumer.accept("method reference consumer");
    }
}
