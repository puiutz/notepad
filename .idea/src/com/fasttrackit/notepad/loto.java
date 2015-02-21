package com.fasttrackit.notepad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by puiutz on 21.02.2015.
 */

public class loto {
    public static void main(String[] args) {

        List myNumbers = new ArrayList<Integer>();
        List myNumbers2 = new ArrayList<Integer>();
        Random rn = new Random();

        int minimum = 1;
        int maximum = 49;
        int n = maximum - minimum + 1; // 49
        for (int x = 1; x < 7; x++) {
            int randomNum = rn.nextInt(n) + minimum;
            myNumbers.add(randomNum);
            System.out.println("first list " + randomNum);
        }
        for (int x = 1; x < 7; x++) {
            int randomNum = rn.nextInt(n) + minimum;
            myNumbers2.add(randomNum);
            System.out.println("second list " + randomNum);

        }

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                if (myNumbers.get(x) == myNumbers2.get(y)) {
                    System.out.println("numar castigator:" + myNumbers.get(x));
                }


            }


        }
    }
}
