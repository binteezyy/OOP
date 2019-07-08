package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer10 {
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
        float rate = Float.parseFloat(getBufferedInput("Enter cost per kilowatt-hour in cents"));
        float kwh = Float.parseFloat(getBufferedInput("Enter kilowatt-hours used per year"));
        float cost = rate / 100 * kwh;
        System.out.println("Annual cost: " + cost);
    }
}