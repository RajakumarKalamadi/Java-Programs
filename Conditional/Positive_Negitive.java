package Conditional;

import java.util.Scanner;

public class Positive_Negitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("The number is is Negitive and skipped");
		}
		else {
			System.out.println(num);
		}
	}

}
