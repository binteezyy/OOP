package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer19 {
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
        int yearOfBirth = Integer.parseInt(getBufferedInput("Year of birth: "));
        int currentYear = Integer.parseInt(getBufferedInput("Current year: "));
        if (yearOfBirth > currentYear)
            currentYear += 100;

        System.out.println("Your age: " + (currentYear - yearOfBirth));
    }
}