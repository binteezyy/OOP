package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer42B {
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
        double balance, monthlyPayment, monthlyInterest, totalPayments = 0;

        balance = Double.parseDouble(getBufferedInput("Enter your balance: "));
        monthlyInterest = Double.parseDouble(getBufferedInput("Enter the monthly interest:"));
        monthlyPayment = Double.parseDouble(getBufferedInput("Enter the monthly payment:"));

        int i = 1;
        while (balance > 0) {
            balance += balance * monthlyInterest / 100;
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;
            System.out.println("Month: " + (i++) + "\tbalance: " + balance + " total payments: " + totalPayments);
        }
    }
}
