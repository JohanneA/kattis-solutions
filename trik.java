import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by le-zo on 20-05-2017.
 */
public class trik {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String input = in.readLine();

        boolean oneIsEmpty = false,
                twoIsEmpty = true,
                threeIsEmpty = true;

        for (int i = 0; i < input.length(); i++) {
            char move = input.charAt(i);
            boolean temp = false;

            if(move == 'A') {
               temp = twoIsEmpty;
               twoIsEmpty = oneIsEmpty;
               oneIsEmpty = temp;

            } else if (move == 'B') {
                temp = twoIsEmpty;
                twoIsEmpty = threeIsEmpty;
                threeIsEmpty = temp;
            } else {
                temp = oneIsEmpty;
                oneIsEmpty = threeIsEmpty;
                threeIsEmpty = temp;
            }
        }

        if(!oneIsEmpty) {
            System.out.println("1");
        } else if(!twoIsEmpty) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }



    }
}
