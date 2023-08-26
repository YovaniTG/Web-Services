package practice.collections;

public class main {

    public static void fizzBuzz(int n) {
        for(int range=1; range <= n; range ++){
            if(range%3 == 0 && range%5 == 0 ){
                System.out.println("FizzBuzz");
            }
            if(range%3==0 && range%5!=0){
                System.out.println("Fizz");
            }
            if(range%5==0 && range%3!=0){
                System.out.println("Buzz");
            }

            if(range%3!=0 && range%5!=0){
                System.out.println(range);
            }

        }

    }

    public static void main(String[] args) {
       // fizzBuzz(15);


        int a=0;
        a+=5;

        System.out.println(a);
    }
}
