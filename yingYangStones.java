package com.zoey.algorithmPrep;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by le-zo on 21-05-2017.
 */
public class yingYangStones {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String stones = in.readLine();
        int counter = 0;

        for (int i = 0; i < stones.length(); i++) {
            char input = stones.charAt(i);

            int white = 0, black = 0;

            if(input == 'B') black++;
            if(input == 'W') white++;

            if((black == white + 1) || (white == black + 1)) {
                counter = 1;
                white = 0;
                black = 0;
            } else {
                counter = 0;
            }
        }
        System.out.println(counter);
    }
}
