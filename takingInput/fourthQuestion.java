package takingInput;

import java.util.Scanner;

public class fourthQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first sum");
		int firstSum_1 = sc.nextInt();
		int firstSum_2 = sc.nextInt();
		System.out.println("Enter the second sum");
		int secondSum_1 = sc.nextInt();
		int secondSum_2 = sc.nextInt();
		System.out.println("Enter the third sum");
		int thirdSum_1 = sc.nextInt();
		int thirdSum_2 = sc.nextInt();
		
		
		System.out.println(firstSum_1+firstSum_2);
		System.out.println(secondSum_1 + secondSum_2);
		System.out.println(thirdSum_1 + thirdSum_2);
	}

}
