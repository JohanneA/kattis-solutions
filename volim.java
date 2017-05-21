package com.zoey.algorithmPrep;
import java.util.Scanner;

/**
 * Created by le-zo on 21-05-2017.
 */
public class volim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTime = 0;

        int startingPlayer = Integer.parseInt(sc.nextLine());
        int turns = Integer.parseInt(sc.nextLine());
        int playerWithBox = startingPlayer;

        for (int i = 0; i < turns; i++) {
            int secondsUsed = sc.nextInt();
            String answer = sc.next();

            totalTime += secondsUsed;

            if (totalTime > 210) break;

            if (answer.equals("T")) {
                playerWithBox++;
                if(playerWithBox > 8) playerWithBox = 1;
            }
        }
        System.out.println(playerWithBox);
    }
}
