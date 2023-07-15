package Operator;

import java.util.Scanner;

public class fourthQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //55
		int b = sc.nextInt(); // 70
		
		System.out.println(a < 50 && a < b);  // false and true = false
		System.out.println(a < 50 || a < b); // false or true = true
	}

}
