package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer26 {
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
        if (frontRight < 35 || frontRight > 45)
            System.out.println("Warning: pressure is out of range");
        float frontLeft = Float.parseFloat(getBufferedInput("Input left front pressure"));
        if (frontLeft < 35 || frontLeft > 45)
            System.out.println("Warning: pressure is out of range");
        float rearRight = Float.parseFloat(getBufferedInput("Input right front pressure"));
        if (rearRight < 35 || rearRight > 45)
            System.out.println("Warning: pressure is out of range");
        float rearLeft = Float.parseFloat(getBufferedInput("Input left front pressure"));
        if (rearLeft < 35 || rearLeft > 45)
            System.out.println("Warning: pressure is out of range");

        System.out.println("Inflation is " + (frontRight == frontLeft && rearRight == rearLeft ? "OK" : "BAD"));
    }
}