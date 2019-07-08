package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer13 {
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
        float X = Float.parseFloat(getBufferedInput("Enter Y: "));
        float Y = Float.parseFloat(getBufferedInput("Enter X: "));
        float A = (X + Y) / 2;
        double H = 2.0 / (1.0 / X + 1.0 / Y);
        System.out.println("Arithmitic mean: " + A);
        System.out.println("Harmonic mean: " + H);
    }
}