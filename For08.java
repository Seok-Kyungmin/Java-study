package For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For08 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(bf.readLine());
		String[] arr;

		for (int i = 1; i <= T; i++) {
			arr = bf.readLine().split(" ");
			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);
			bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
		}

		bw.flush();
		bf.close();
		bw.close();
	}

}