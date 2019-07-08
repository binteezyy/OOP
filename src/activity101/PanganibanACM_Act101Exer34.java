package activity101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PanganibanACM_Act101Exer34 {
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
        int n = Integer.parseInt(getBufferedInput("Upper Limit: "));
        int squares = 0, cubes = 0;
        squares = (n * (n + 1) * ((2 * n) + 1)) / 6;
        cubes = ((n * n) * ((n + 1) * (n + 1)) / 4);
        System.out.println("The sum of Squares is " + squares);
        System.out.println("The sume of Cubes is " + cubes);
    }

}
