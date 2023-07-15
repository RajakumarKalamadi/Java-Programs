package takingInput;

import java.util.Scanner;

public class fifthQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first two words");
		String str_1 = sc.next();
		String str_2 = sc.next();
		System.out.println("Enter the second two words");
		String str_2_1 = sc.next();
		String str_2_2 = sc.next();
		System.out.println("Enter the third two words");
		String str_3_1 = sc.next();
		String str_3_2 = sc.next();
		System.out.println("Enter the fourth two words");
		String str_4_1 = sc.next();
		String Str_4_2 = sc.next();
		
		
		System.out.println(str_1 + str_2);
		System.out.println(str_2_1+ str_2_2);
		System.out.println(str_3_1 + str_3_2);
		System.out.println(str_4_1 + Str_4_2);
	}

}
