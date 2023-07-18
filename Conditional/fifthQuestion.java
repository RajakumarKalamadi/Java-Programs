package Conditional;

import java.util.Scanner;

public class fifthQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int num_1 = sc.nextInt();
		System.out.println("Please enter a operator + - * / %");
		String op = sc.next();
		System.out.println("Please enter second number");
		int num_2 = sc.nextInt();
		
		switch(op)
		{
		case "+":
			System.out.println("The sum is :"+ (num_1 + num_2));
			break;
		case "-":
			System.out.println("The Substraction is : "+ (num_1 - num_2));
			break;
		case "*":
			System.out.println("The Multiplication is :"+ (num_1 * num_2));
			break;
		case "/":
			System.out.println("The Division is : "+ (num_1 / num_2));
			break;
		case "%":
			System.out.println("The Reminder is"+ (num_1 % num_2));
			break;
		default:
			System.out.println("Please eneter a valid operator");
		}
	}

}
