package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer24 {
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
        float checking = Float.parseFloat(getBufferedInput("Checking balance: "));
        float saving = Float.parseFloat(getBufferedInput("Saving balance: "));

        double charge = ((checking > 1000) || (saving > 1500)) ? 0 : 0.15;
        System.out.println("Charge: " + charge);
    }
}