package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer07 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String cash = "";
        System.out.println("Input the cents:");
        try {
            cash = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        int cash_int = Integer.parseInt(cash);
        int cents = cash_int % 100;
        int dollar = cash_int / 100;
        System.out.println("That is " + dollar + " dollars and " + cents + " cents");
    }
}