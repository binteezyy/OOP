package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer29 {
    public static String getBufferedInput(String out_string) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input_string = "";
        System.out.println(out_string);
        try {
            input_string = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        return input_string;
    }

    public static void main(String[] args) {
        String inputString = getBufferedInput("Enter a word: ");
        int times = inputString.length();
        System.out.println();

        for (int i = 0; i < times; i++) {
            System.out.println(inputString);
        }
    }
}