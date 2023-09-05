package practice.algorithms;
// change the values from a to b without using a third variable.
public class ChangeValuesfromAtoB {

    public static void main(String[] args) {


        int a = 8;
        int b = 9;

        b= b + a;//b = 3

        a = b - a;// a = 2 ; b =3

        b = b - a;// b = 1


        System.out.println("a = " + a + " b = " + b );


    }
}
