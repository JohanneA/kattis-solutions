package com.zoey.algorithmPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by le-zo on 13-05-2017.
 */
public class fourThought {

    BufferedReader in;
    final int number = 4;
    final char ADDITION = '+';
    final char SUBTRACTION = '-';
    final char MULTIPLICATION = '*';
    final char DIVISION = '/';

  /*  private boolean findSolution(int input) {
        if (isSolution(input)) {
            return true;
        }
        return false;
    }

    private boolean isSolution(int input) {
        return;
    }

    private boolean isEven(int input) {
        return

    }

    private boolean isUneven(int input) {

    } */

    private void printResult() {

    }

    private void start() throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        int numberOfTestCases = Integer.parseInt(in.readLine());

        for (int i = 0; i < numberOfTestCases; i++) {
            int inputResult = Integer.parseInt(in.readLine());

           /* if(findSolution(inputResult)) {
                printResult();
            } else {
                System.out.println("no solution");
            }*/
        }
    }

    public static void main(String[] args) throws IOException {
        new fourThought().start();
    }
}
