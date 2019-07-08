package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer09 {
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

        int voltage = Integer.parseInt(getBufferedInput("Enter voltage: "));
        int resistance = Integer.parseInt(getBufferedInput("Enter resistance: "));

        float current = voltage / resistance;

        System.out.println("Current is: " + current);
    }
}