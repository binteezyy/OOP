package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer21 {
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
        float tair = Float.parseFloat(getBufferedInput("Enter air temperature: "));
        float tsteam = Float.parseFloat(getBufferedInput("Enter steam temperature: "));
        tsteam = (tsteam < 373) ? tair : tsteam;
        float efficiency = 1 - (tair / tsteam);
        System.out.println("Efficiency: " + efficiency);
    }
}