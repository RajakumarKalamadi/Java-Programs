package takingInput;

import java.util.Scanner;

public class first_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the complete line");
		String firstName = sc.next();
		String lastName = sc.next();
		int rollNo = sc.nextInt();
		String fieldOfInterst = sc.next();
		
		
		System.out.println("Name: "+ firstName + " "+ lastName);
		System.out.println("Roll Number : " + rollNo);
		System.out.println("Filed of interst : "+ fieldOfInterst);
	}

}
