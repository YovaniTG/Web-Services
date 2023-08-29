package practice.algorithms;

public class Palindrome {

    public static boolean isPalindrome(String sentence){
        int right=sentence.length()-1;
        int left=0;

        if (sentence == null){
            return false;
        }
        if(sentence.length() == 1){
            return true;
        }

        while(left < right){

            System.out.println("left: " + sentence.charAt(left) + " right: " +sentence.charAt(right));

            if (sentence.charAt(left) != sentence.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String sentence= "abonoba";

        if (isPalindrome(sentence)){
            System.out.println("It's Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
