package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer35 {
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
		float X = Float.parseFloat(getBufferedInput("Enter X"));
		int N = Integer.parseInt(getBufferedInput("Enter N"));
		if (X < 0) {
			System.out.println("N must be a positive integer");
		} else {
			System.out.println();
			float Xn = X;
			for (int i = 1; i < N; i++) {
				Xn *= X;
			}
			System.out.println(X + " raised to the power " + N + " is: " + Xn);
		}
	}
}
