package practice.algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FallingRocks {
/*    
'*' - empty space
'.' - single rock
':' - double rock
'-' - magic floating floor

                Input
        '.'    '.'    '*'
        '*'    '-'    ':'
        '.'    '.'    '.'
        '*'    '*'    '*'
        ----    ----    ----
            Output
        '*'    '.'    '*'
        '*'    '-'    '*'
        '*'    '*'    '.'
        ':'    '.'    ':'
    
    */

    public static void main(String[] args) {
        String input="*:.*";
        applyGravity(input).stream().forEach(System.out::println);
    }

    private static List<Character> applyGravity(String input) {
        ArrayList<Character> ListofElements = new ArrayList<>();
        boolean isModified = false;

        for(Character c: input.toCharArray()){
            ListofElements.add(c);
        }

        for (int currentPos=0; currentPos < ListofElements.size(); currentPos ++){

            for (int innerPos=0; innerPos < ListofElements.size()-1; innerPos ++){
                //* ignore
                //. * it should swap, "." it will merge into : and set * current innerPos.
                // - ignore
                // :  * swap, . convert to : and set . current innerPos,
                char above = ListofElements.get(innerPos);
                char below = ListofElements.get(innerPos+1);


                    if (above == '.'){
                        if (below == '*'){
                            swap(innerPos,ListofElements);

                        }
                        else if (below == '.'){
                            merge(innerPos,'.',ListofElements);

                        }
                    }

                    if (above == ':'){
                      if (below == '*'){
                          swap(innerPos,ListofElements);

                      }
                      else if (below == '.'){
                          merge(innerPos,':',ListofElements);

                      }
                    }





            }
        }




        return ListofElements;
    }

    private static void merge(int innerPos, char elementType ,ArrayList<Character> ListofElements) {
        char above = ListofElements.get(innerPos);
        char below = ListofElements.get(innerPos+1);

        if (elementType == '.'){
            ListofElements.set(innerPos, '*');
            ListofElements.set(innerPos+1, ':');
        }
        else if (elementType == ':'){
            ListofElements.set(innerPos, '.');
            ListofElements.set(innerPos+1, ':');
        }


    }

    private static void swap(int innerPos, ArrayList<Character> ListofElements) {
        char above = ListofElements.get(innerPos);
        char below = ListofElements.get(innerPos+1);

        ListofElements.set(innerPos, below);
        ListofElements.set(innerPos+1, above);

    }




}
