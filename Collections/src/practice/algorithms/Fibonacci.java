package practice.algorithms;

public class Fibonacci {


    private static long fibonacci(int n) {
       int first = 1;
       int second = 1;
       int fibonacciResult=0;

       for (int i=2; i < n; i ++){
           fibonacciResult = first + second;

           first = second;
           second = fibonacciResult;
       }


        return fibonacciResult;
    }

    //9

    public static void main(String[] args) {
        int n= 6;
        System.out.println(fibonacci(n));

        //n = 6 (6 - 1 = 5) + (6 - 2 = 4) = (9  - 1) + (9 - 2) 8 + 7

        // 0 1 1 2 3 5 8
    }


}
