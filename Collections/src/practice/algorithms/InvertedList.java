package practice.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvertedList {

    public static List<Integer> invertList (List<Integer> normalList){
        List<Integer> invertedList = new ArrayList<>();

//4 size  0  --  3

        for (int i=normalList.size(); i > 0; i--){

            invertedList.add(normalList.get(i-1));
        }



        return invertedList;
    }


    public static void main(String[] args) {
        List<Integer> normalList = new ArrayList<>();


        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);

        //Collections.reverse(normalList);  <-- easy way to reverse a list.
        System.out.println("Normal List: " + normalList);
        System.out.println("Inverted List: " + invertList(normalList));

    }
}
