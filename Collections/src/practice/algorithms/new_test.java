package practice.algorithms;

public class new_test {
//send balance (()){{}},    ({[]}),   [[{]}],  (()( )()), () [] {} , ({}[]), keys = ( [ { values = ) ] }

    //given string is a palindrome adcda, a , a Dc dA,
    public static void main(String[] args) {
        String input="Anita lava la tina";
        input = input.replace(" ","");
        input = input.toLowerCase();

        char chararcters [] = input.toCharArray();
        System.out.println(chararcters);
        System.out.println(checkPalindrome(chararcters));

    }

    private static boolean checkPalindrome(char[] chararcters) {
        int left= 0;
        int right= chararcters.length-1;
        while(left < right){ // adcda
            if (!(chararcters[left] == chararcters[right])){
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }
}
