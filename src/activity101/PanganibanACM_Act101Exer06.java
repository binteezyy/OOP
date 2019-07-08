package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer06 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String radius = "";
        System.out.println("Input the radius:");
        try {
            radius = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        int rad = Integer.parseInt(radius);
        double area = Math.pow((double) rad, 2) * Math.PI;
        System.out.println("The radius is: " + rad + " The area is: " + area);
    }
}