package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer41 {
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
        System.out.println("Computer Aided Design Program");
        while (true) {
            int x1, y1, x2, y2, width, height, area;
            x1 = Integer.parseInt(getBufferedInput("First corner X coordinate:"));

            y1 = Integer.parseInt(getBufferedInput("First corner Y coordinate:"));

            x2 = Integer.parseInt(getBufferedInput("Second corner X coordinate:"));

            y2 = Integer.parseInt(getBufferedInput("Second corner Y coordinate:"));

            width = Math.abs(x1 - x2);
            height = Math.abs(y1 - y2);
            if (width == 0 || height == 0) {
                System.out.println("Cannot be a rectangle");
                break;
            }
            area = width * height;
            System.out.println("Width: " + width + " Height: " + height + " Area: " + area + "\n");
        }
    }
}
