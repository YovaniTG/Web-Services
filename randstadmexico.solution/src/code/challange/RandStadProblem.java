package code.challange;

import java.util.Scanner;

public class RandStadProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int k = 0;

        int x = sc.nextInt();

        if (x < 3 || x > 10000000) { //setting constraint for x, which will be the length value for my list.
            System.out.println("Can only be in range of 3 to 10000000");
            return;
        }
        int y = sc.nextInt();
        if (y < 1 || y > 200000) { // setting constraint for y, which will be the number of operations to perform.
            System.out.println("Can only be in range from 1 to 200,000");
            return;
        }

        int[] list = new int[x]; // creating list with the value of x


        for (int n = 0; n < y; n++) { //Number of operations using value of Y.

            start = sc.nextInt() - 1; //Starting range, value of I
            end = sc.nextInt() - 1; //Ending Range, value of J
            k = sc.nextInt(); // value to be set in the given range inside the list.

            if (start < 0 || start > x - 1 || k < 0 || k > 1000000000 || end < start) { //setting the constraints
                System.out.println("Invalid input");
                return;
            }

            for (int pos = start; pos <= end; pos++) { // setting numbers given from K inside the list using the start and end positions as range.
                list[pos] += k;
            }
        }
        int op = list[0];

        for (int a = 0; a < list.length; a++) { //selecting the maximum value in the list.
            if (op < list[a]) {
                op = list[a];
            }
        }


        System.out.println("The maximum value is: " + op);


    }
}
