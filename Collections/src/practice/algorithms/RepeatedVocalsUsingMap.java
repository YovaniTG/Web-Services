package practice.algorithms;

import java.util.HashMap;
import java.util.Map;

public class RepeatedVocalsUsingMap {

    //program that reads repeated vocals in a sentence.
    public static Map<Character,Integer> fillMapWithVocals(Map<Character, Integer> repeatedVocalsMap){

        repeatedVocalsMap.put('a', 0);
        repeatedVocalsMap.put('e', 0);
        repeatedVocalsMap.put('i', 0);
        repeatedVocalsMap.put('o', 0);
        repeatedVocalsMap.put('u', 0);

        return repeatedVocalsMap;
    }
    public static Map<Character, Integer> checkRepeatedVocals(String sentence){
        sentence.toLowerCase();

        Map<Character, Integer> repeatedVocalsMap = new HashMap<>();

        fillMapWithVocals(repeatedVocalsMap);

        for (int i=0; i < sentence.length(); i++){

            if (repeatedVocalsMap.containsKey(sentence.charAt(i))){

                repeatedVocalsMap.put(sentence.charAt(i), repeatedVocalsMap.get(sentence.charAt(i))+1);

            }
        }



        return repeatedVocalsMap;
    }

    public static void main(String[] args) {
        System.out.println(checkRepeatedVocals("holiae e  como uuuestasiii"));

    }
}
