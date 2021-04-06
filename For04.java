package For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(bf.readLine());
		String[] arr;
		int A;
		int B;
		for (int i = 0; i < T; i++) {
			arr = bf.readLine().split(" ");
			A = Integer.parseInt(arr[0]);
			B = Integer.parseInt(arr[1]);

			bw.write((A + B) + "\n");

		}

		bw.flush();
		bf.close();
		bw.close();
	}

}
