package activity101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PanganibanACM_Act101Exer33 {
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
		double avg = 0, avgsq = 0, N, num;
		double sd;
		N = Integer.parseInt(getBufferedInput("Enter N: "));
		System.out.println("Enter the numbers: ");

		for (int i = 0; i < N; i++) {
			num = Integer.parseInt(getBufferedInput(""));
			avg += num;
			avgsq += num * num;
		}
		// System.out.println(avg + " " + avgsq);
		avg /= N;
		avg *= avg;
		avgsq /= N;
		sd = Math.sqrt(avgsq - avg);
		System.out.println("Standard deviation is: " + sd);
	}

}
