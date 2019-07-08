package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer23 {
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
        System.out.println("Welcome to Yertle's Quest");
        String Name = getBufferedInput("Enter the name of your character: ");
        int strength = Integer.parseInt(getBufferedInput("Enter strenght (1-10): "));
        int health = Integer.parseInt(getBufferedInput("Enter health (1-10): "));
        int luck = Integer.parseInt(getBufferedInput("Enter luck (1-10): "));

        if ((strength + health + luck) > 15) {
            strength = 5;
            health = 5;
            luck = 5;
        }
        System.out.println(Name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
    }
}