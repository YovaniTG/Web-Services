package practice.algorithms;

public class EvenNumbersto100 {

    public static void showEvenNumbers(int rangeInput){
        if (rangeInput != 0){
            for (int currentNumber=1; currentNumber < rangeInput; currentNumber++){
                if (currentNumber % 2 == 0){
                    System.out.println(currentNumber);
                }
            }
        }

    }

    public static void main(String[] args) {
        showEvenNumbers(100);
    }
}
