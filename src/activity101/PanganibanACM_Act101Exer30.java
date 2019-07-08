package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer30 {
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
        String first = getBufferedInput("Enter first word:");
        String second = getBufferedInput("Enter second word: ");
        System.out.print(first);
        for (int i = 0; i < 30 - first.length() - second.length(); i++) {
            System.out.print(".");
        }
        System.out.print(second);
    }
}