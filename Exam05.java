package Step2;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int M = s.nextInt();
		 if(M<45) {
			 M -= 45;
			 M += 60;
			 if(H==0){
				 H = 24;
				 H -= 1;
				 System.out.println(H + " " + M);
			 }else {
				 H -= 1;
				 System.out.println(H + " " + M);
			 } 
		 } else {
			 M -= 45;
			 System.out.println(H + " " + M);
		 }
	}

}
