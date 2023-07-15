package Operator;

import java.util.Scanner;

public class secondQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); // 10
		int y = sc.nextInt(); // 20
		System.out.println("Before swapping");
		System.out.println(x);
		System.out.println(y);
		
		x = x + y; // 30
		y = x - y; // 30 - 20 = 10;
		x = x - y; // 30 - 10 = 20;
		System.out.println("After swapping");
		System.out.println(x);
		System.out.println(y);
	}

}
