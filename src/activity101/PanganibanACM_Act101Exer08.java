package activity101;

import java.io.*;

// Convert number to words
public class PanganibanACM_Act101Exer08 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String change = "";
        System.out.println("Input the cents:");
        try {
            change = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        int change_int = Integer.parseInt(change);
        int remaining = 0;
        int dollar = change_int / 100;
        remaining = change_int % 100;
        int quarter = remaining / 25;
        remaining %= 25;
        int dime = remaining / 10;
        remaining %= 10;
        int nickel = remaining / 5;
        remaining %= 5;

        System.out.println("Your change is: " + dollar + " dollar," + quarter + " quarter," + dime + " dime," + nickel
                + " nickel, " + remaining + " cents");
    }
}