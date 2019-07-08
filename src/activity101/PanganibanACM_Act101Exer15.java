package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer15 {
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
        int boltPrice = 5, nutPRice = 3, washerPrice = 1;
        int bolts = Integer.parseInt(getBufferedInput("Number of bolts: "));
        int nuts = Integer.parseInt(getBufferedInput("Number of nuts: "));
        int washers = Integer.parseInt(getBufferedInput("Number of washers: "));

        System.out.println(bolts > nuts ? "Check the Order" : "Order is OK");
        System.out.println("Total cost: " + (bolts * boltPrice + nuts * nutPRice + washers * washerPrice));
    }
}