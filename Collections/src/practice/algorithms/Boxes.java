package practice.algorithms;

import java.util.*;

public class Boxes {

    public static List<Integer> returnMaximumBox(List<Integer > originalList){
        List<Integer> boxA = new ArrayList<>();
        List<Integer> boxB = new ArrayList<>();

        Collections.sort(originalList);

        boxA.add(originalList.get(originalList.size() - 1));
        boxA.add(originalList.get(originalList.size() - 2));

        for (int position=0; position < originalList.size()-2; position++){
            boxB.add(originalList.get(position));
        }

        return boxA;
    }

    public static void main(String[] args) {
        List<Integer > originalList = Arrays.asList(5,4,2,1,2,3);

        System.out.println(returnMaximumBox(originalList));

    }
}
