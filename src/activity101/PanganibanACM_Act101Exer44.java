package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer44 {
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
        double epsilon = 1E-12;
        double term, sum = 1, f = 1;
        int n = 1;
        int x = Integer.parseInt(getBufferedInput("Enter x:"));
        double N = x;
        while (true) {
            term = N / f;
            sum += term;
            System.out.println("n:" + n + " term: " + term + "\tsum: " + sum);
            n++;
            if (term < epsilon)
                break;
            N *= x;
            f *= n;
        }
        System.out.println("my e^x: " + sum);
        System.out.println("real e^x: " + Math.exp(x));
    }
}
