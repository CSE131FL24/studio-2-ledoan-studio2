package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// 		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		
		System.out.print("Start amount:");
		double startamount = in.nextDouble();
		double winchance = (double) (Math.random());
		
		while (startamount <= 5 || startamount >= 0) {
		if (winchance == 0.1 || winchance == 0.2) {
			System.out.println(startamount);
			startamount++;
		}
		else {
			System.out.println(startamount);
			startamount -= 1;
		}
		}
		
		if (startamount == 5) {
			System.out.println("Success");
		}
		
		if (startamount == 0){
			System.out.println("Ruin");
		}
		

	}

}
