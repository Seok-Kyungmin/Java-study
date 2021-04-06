package For;

import java.util.Scanner;

public class For09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println(" ");
		}

	}

}
