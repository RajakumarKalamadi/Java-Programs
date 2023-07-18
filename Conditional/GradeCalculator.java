package Conditional;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>=90 &&  num <=100)
		{
			System.out.println("Your grade is A+");
		}else if(num >=80 && num < 90) {
			System.out.println("Your grade is A");
		}else if(num>=70 && num < 80) {
			System.out.println("Your grade is B+");
		}else if(num>=60 && num < 70) {
			System.out.println("Your grade is B");
		}else if(num >= 50 && num < 60) {
			System.out.println("Your grade is C");
		}else if(num >= 40 && num < 50) {
			System.out.println("Your grade is D");
		}else if(num >= 30 && num < 40) {
			System.out.println("Your grade is E");
		}else if(num >= 0 && num <30) {
			System.out.println("Your grade is F");
		}else {
			System.out.println("Please enter a valid number");
		}
		
		
		
	}

}
