package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer16 {
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
        int tankCapacity = Integer.parseInt(getBufferedInput("Tank capacity: "));
        int Gage = Integer.parseInt(getBufferedInput("Gage reading: "));
        int MPG = Integer.parseInt(getBufferedInput("Miles per gallon"));
        System.out.println((200 <= (int) ((tankCapacity * (Gage * 1.0 / 100)) * MPG)) ? "Safe to proceed" : "Get Gas!");
    }
}