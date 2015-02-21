package com.fasttrackit.notepad; /**
 * Created by puiutz on 21.02.2015.
 */

import java.io.IOException;

public class Notepad {


    public static void main(String[] args) {
        try {
            System.out.println("Opening notepad");
            Runtime runTime = Runtime.getRuntime();
            Process process = runTime.exec("notepad");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Closing notepad");
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

