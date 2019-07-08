package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer28 {
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
        int start = Integer.parseInt(getBufferedInput("Enter start: "));
        int end = Integer.parseInt(getBufferedInput("Enter end: "));
        System.out.println();
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}