package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer25 {
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
        float frontRight = Float.parseFloat(getBufferedInput("Input right front pressure"));
        float frontLeft = Float.parseFloat(getBufferedInput("Input left front pressure"));
        float rearRight = Float.parseFloat(getBufferedInput("Input right rear pressure"));
        float rearLeft = Float.parseFloat(getBufferedInput("Input left rear pressure"));

        System.out.println("Inflation is " + (frontRight == frontLeft && rearRight == rearLeft ? "OK" : "BAD"));
    }
}