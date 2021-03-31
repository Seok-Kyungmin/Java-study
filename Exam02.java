package Step2;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		if(N>=90) {
			 System.out.println("A");
		 }else if(N>=80) {
			 System.out.println("B");
		 }else if(N>=70) {
			 System.out.println("C");
		 }else if(N>=60) {
			 System.out.println("D");
		 }else {
			 System.out.println("F");
		 }
		
	}
}
