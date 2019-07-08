package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer22 {
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
        int items = Integer.parseInt(getBufferedInput("Enter number of items: "));
        float time = Float.parseFloat(getBufferedInput("Enter single-item heating time (in minutes): "));

        if (items == 1) {
        } else if (items == 2) {
            time *= 1.5;
        } else if (time == 3) {
            time *= 2;
        } else if (time > 3) {
            System.out.println("Heating with more than 3 items is not recommended");
        }
        System.out.println("Recommended heating time: " + time + " minutes");
    }
}