package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer11 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String seconds = "";
        System.out.println("Enter the number of seconds");
        try {
            seconds = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        double g = 32.174;
        double seconds_f = Double.parseDouble(seconds);
        double distance = 0.5 * g * Math.pow(seconds_f, 2);
        System.out.println("Distance: " + (float) distance + " feet");
    }
}