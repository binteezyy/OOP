package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer43 {
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
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int month = 0;
        double effectiveness = Double.parseDouble(getBufferedInput("Enter effectiveness:"));
        double half = effectiveness / 2;
        while (true) {
            System.out.print("month: " + (month++) + "\teffectiveness: " + effectiveness);
            effectiveness *= 0.96;
            if (effectiveness < half) {
                System.out.println();
                System.out.println("month: " + month + "\teffectiveness: " + effectiveness + " DISCARDED");
                break;
            }
            System.out.println();
        }
    }
}
