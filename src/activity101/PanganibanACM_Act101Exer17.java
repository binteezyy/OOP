package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer17 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String w = "";
        System.out.println("Write your weight in pounds:");
        try {
            w = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        float weight = Float.parseFloat(w);
        System.out.println((weight >= 30 && weight <= 250) ? "You are allowed in the contest"
                : "You are not allowed in the contest");
    }
}