package com.zoey.algorithmPrep;

/**
 * Created by le-zo on 08-05-2017.
 */
public class repeatedLetter {

    public boolean isRepeated(int index, char inputChar, char[] inputArray) {

        for(int j = 0; j < index; j++) {
            if( inputChar == inputArray[j]) {
                return true;
            }
        }
        return false;
    }

    public void start(String input) {
        char[] inputChars = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            inputChars[i] = input.charAt(i);

            if (i != 0 && isRepeated(i, inputChars[i], inputChars)) {
                // exit
                System.out.print("Repeated letter is: " + inputChars[i]);
                System.exit(0);
            }
        }
    }

    public static void main (String[] args) { new repeatedLetter().start(args[0]); }
}