package Conditional;

import java.util.Scanner;

public class secondQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num < 0) {
			
			num = num * -1;
		}
		System.out.println(num);
	}

}
