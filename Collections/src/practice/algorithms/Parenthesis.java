package practice.algorithms;

import javax.lang.model.element.Element;
import java.util.Stack;

public class Parenthesis {

    /*
    Given a string of parenthesis please check if they are properly closed,
    example: ((( ))) [correct], (()())[correct], (( ))) [wrong]



     */
    public static boolean checkParenthesis(char [] charParenthesis){
        Stack<Character> characterStack = new Stack<>();

        for(Character character: charParenthesis){
            if (character == '('){
                characterStack.push(character);
            }else if(character == ')'){
                if (characterStack.empty() || characterStack.pop() != '('){
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String parenthesis = "((( )))";
        char [] charParenthesis = parenthesis.toCharArray();




    }

}
