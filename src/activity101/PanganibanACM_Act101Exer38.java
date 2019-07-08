package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer38 {
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
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        double init, fin, gal, miles;
        System.out.println("Miles Per Gallon Program");

        init = Double.parseDouble(getBufferedInput("Initial miles:"));

        if (init < 0)
            System.out.println("bye");
        else {
            fin = Double.parseDouble(getBufferedInput("Final miles: "));

            gal = Double.parseDouble(getBufferedInput("Gallons"));

            miles = (fin - init) / gal;
            System.out.println("Miles per Gallon: " + miles);
        }
    }
}
