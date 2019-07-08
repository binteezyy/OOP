package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer32 {
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
        int N = Integer.parseInt(getBufferedInput("Enter N: "));
        double sum = 0.0;

        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        System.out.println();
        System.out.println(sum);
    }
}