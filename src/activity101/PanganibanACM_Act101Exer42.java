package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer42 {
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
        double balance = 1000, totalPayments = 0, monthlyPayment;
        monthlyPayment = Double.parseDouble(getBufferedInput("Enter the monthly payment:"));
        int i = 1;
        while (balance > 0) {
            balance += balance * 0.015;
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;
            System.out.println("Month: " + (i++) + "\tbalance: " + balance + " total payments: " + totalPayments);
        }
    }
}
