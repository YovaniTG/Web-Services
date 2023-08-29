package practice.algorithms;

import java.util.*;

public class repeatedListChar {
//a b a c b

    public static Map <Character, Integer> checkCharacterDuplicate(List<Character> characters){ //con mapas.
        Map <Character, Integer> duplicateCharacters = new HashMap<>();
        //int counter = 0;
        if (!characters.isEmpty()){
            for (Character character : characters) {
                    duplicateCharacters.put(character, duplicateCharacters.getOrDefault(character, 0)+1);

            }


        }

        return duplicateCharacters;
    }






    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        characters.add('a');
        characters.add('b');
        characters.add('a');
        characters.add('c');
        characters.add('b');
        characters.add('c');
        characters.add('b');

        Collections.sort(characters);
        System.out.println("List: " + characters);

       // System.out.println("Duplicate characters: " + checkCharacterDuplicate(characters));

       // checkDuplicates(characters);

        for (Map.Entry<Character, Integer> entry : checkCharacterDuplicate(characters).entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - Aparece " + entry.getValue() + " veces");
            }
        }

    }
}
