package Conditional;

import java.util.Scanner;

public class firstQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a length");
		int length = sc.nextInt();
		System.out.println("Please enter a bredth");
		int bredth = sc.nextInt();
		
		if(length == bredth) {
			System.out.println("Squre");
		}
		else {
			System.out.println("Not a suare");
		}
		
	}

}
