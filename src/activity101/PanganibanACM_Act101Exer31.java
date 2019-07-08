package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer31 {
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
        int counter = Integer.parseInt(getBufferedInput("How many integers will be added: "));
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            int num = Integer.parseInt(getBufferedInput("Enter an integer"));
            sum += num;
        }
        System.out.println("The sum is " + sum);
    }
}