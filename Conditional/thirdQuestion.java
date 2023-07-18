package Conditional;

import java.util.Scanner;

public class thirdQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Selling Price");
		int S_P = sc.nextInt();
		System.out.println("Enter a cost price");
		int C_P = sc.nextInt();
		
		int ans = S_P - C_P;
		
		if(ans < 0) {
			System.out.println("Loss = " + ans);
		}else if(ans == 0) {
			System.out.println("No Prifit = " + ans);
		}else {
			System.out.println("Profit = "+ ans);
		}
	}

}
