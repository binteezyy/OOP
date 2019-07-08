package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer18 {
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
        float apound = Float.parseFloat(getBufferedInput("Price per pound package A: "));
        float alean = Float.parseFloat(getBufferedInput("Percent lean package A: "));
        float bpound = Float.parseFloat(getBufferedInput("Price per pound package B: "));
        float blean = Float.parseFloat(getBufferedInput("Percent lean package B:"));

        float packageA = (apound / alean) * 100, packageB = (bpound / blean) * 100;
        System.out.println("Package A cost per pound of lean:" + packageA);
        System.out.println("Package B cost per pound of lean:" + packageB);
        System.out.println(packageA < packageB ? "Package A is the best Value" : "Package B is the best Value");

    }
}