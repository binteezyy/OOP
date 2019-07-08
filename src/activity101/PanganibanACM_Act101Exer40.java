package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer40 {
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
		int handling = 3;
		float shipping = 0;
		int weight = 0;
		while (true) {
			weight = Integer.parseInt(getBufferedInput("Weight of Order:"));
			if (weight == 0) {
				break;
			} else if (weight > 10) {
				for (int i = weight - 10; i > 0; i--) {
					shipping += 0.25;
				}
			}
			System.out.println("Shipping cost: $" + (handling + shipping));
		}
		System.out.println("bye");
	}
}
