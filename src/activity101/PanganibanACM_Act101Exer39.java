package activity101;

import java.io.*;

public class PanganibanACM_Act101Exer39 {
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
		System.out.println("In-range Adder");
		int low = Integer.parseInt(getBufferedInput("Low end of range"));
		int high = Integer.parseInt(getBufferedInput("High end of range"));

		int data, inR = 0, notR = 0;

		while (true) {
			data = Integer.parseInt(getBufferedInput("Enter data: "));

			if (data == 0) {
				break;
			}
			if (data >= 20 && data <= 50) {
				inR += data;
			} else {
				notR += data;
			}
		}
		System.out.println("Sum of in range values: " + inR);
		System.out.println("Sume of out range values: " + notR);
	}
}
