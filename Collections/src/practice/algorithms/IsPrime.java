package practice.algorithms;

public class IsPrime {

    public static int isPrime(int givenNumber){
        int count=0;
        for (int currentNumber = 1; currentNumber <= givenNumber; currentNumber++){
            if (givenNumber % currentNumber == 0){
                count++;

            }
        }
            return count;
    }

    public static void main(String[] args) {


        if (isPrime(17) == 2){
            System.out.println("It's prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
