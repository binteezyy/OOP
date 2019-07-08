package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer12 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String X = "";
        System.out.println("Enter a double: ");
        try {
            X = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        double X_d = Double.parseDouble(X);
        double log = Math.log(X_d) / Math.log(2);
        System.out.println("Base 2 log of " + X + " is " + log);
    }
}