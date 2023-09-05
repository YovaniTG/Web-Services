package practice.algorithms;

import java.util.function.Supplier;

public class SupplierFunctionalInterface {

    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);

        System.out.println(randomSupplier.get());

    }
}
