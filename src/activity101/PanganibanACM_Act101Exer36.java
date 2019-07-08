package activity101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PanganibanACM_Act101Exer36 {
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
        int n = Integer.parseInt(getBufferedInput("Initial number of stars: "));
        for (int i = n; i > 0; i--) {
            for (int x = i; x > 0; x--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
