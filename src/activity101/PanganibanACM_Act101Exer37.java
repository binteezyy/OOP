package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer37 {
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
		for (int x = 8, y = 1; x > 0; x--, y += 2) {
			for (int n = x; n > 0; n--) {
				System.out.print(" ");
			}
			for (int n = y; n > 0; n--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int x = 0; x < 3; x++) {
			for (int z = 1; z < 8; z++) {
				System.out.print(" ");
			}
			for (int y = 0; y < 3; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
