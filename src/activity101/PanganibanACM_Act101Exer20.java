package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer20 {
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
        String i = getBufferedInput("Enter the item: ");
        double price = (Double.parseDouble(getBufferedInput("Enter the price: "))) / 100.00;
        double shipping = price >= 10 ? 3.00 : 2.00;

        int overnight = Integer.parseInt(getBufferedInput("Overnight delivery (0==no, 1==yes)"));
        if (overnight == 1)
            shipping += 5.00;

        System.out.println("Invoice:");
        System.out.println(i + " " + price);
        System.out.println("shipping " + shipping);
        System.out.println("total " + (price + shipping));
    }
}