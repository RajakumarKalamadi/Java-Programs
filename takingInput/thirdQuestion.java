package takingInput;

import java.util.Scanner;

public class thirdQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ypur marks");
		System.out.println("Enter your first subject marks");
		int sub_1 = sc.nextInt();
		System.out.println("Enter your seconf subject marks");
		int sub_2 = sc.nextInt();
		System.out.println("Enter your third subject marks");
		int sub_3 = sc.nextInt();
		
		System.out.println("Total Marks : " + sub_1 + sub_2 + sub_3);
		System.out.println("Percentage Marks : " + (sub_1 + sub_2 + sub_3)/3 + "%");
	}

}
