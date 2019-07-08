package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer14 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String purchase = "";
        System.out.println("Enter amount of purchases:");
        try {
            purchase = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        int purchase_i = Integer.parseInt(purchase);
        System.out.println("Discounted price: " + (int) (purchase_i * .9));
    }
}