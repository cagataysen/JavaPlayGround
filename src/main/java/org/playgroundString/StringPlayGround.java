package org.playgroundString;

public class StringPlayGround {

    public static String reverseStringWithStringBuilder(String word){
        StringBuilder result = new StringBuilder(word);
        return result.reverse().toString();
    }


    public static String reverseStringWithForLoop(String word) {
        String reverseWord = "";
        char ch;

        for(int i = 0; i < word.length(); i++){
            reverseWord = word.charAt(i) + reverseWord;
        }

        return reverseWord;

    }


    public static boolean isStringPalindrome(String input){
        if(input.equalsIgnoreCase(reverseStringWithStringBuilder(input))){
            return true;
        }
        return false;
    }



    public static void main(String[] args){
        String word = "abcd";
        String input = "abcdedcba";
        System.out.println(reverseStringWithStringBuilder(word));
        System.out.println(reverseStringWithForLoop(word));

        System.out.println(isStringPalindrome(input));


    }
}
