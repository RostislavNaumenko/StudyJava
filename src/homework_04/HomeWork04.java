package homework_04;

import java.sql.Array;

public class HomeWork04 {

    // Of you refer the ASCII chart for the same, then you will observe that there is a difference of 32 between the lowercase and uppercase characters.
    static final int interval = 32;

    static String charsToUpperCaseString(char[] chars) {
        String word = "";

        for (char letter: chars) {
            word += (char)(letter-interval);
        }

        return word;
    }


    public static void main(String[] args) {
        char[] nameLetters = new char [] {'r','o','s','t','y','s','l','a','v'};

        System.out.println(charsToUpperCaseString(nameLetters));


    }
}

