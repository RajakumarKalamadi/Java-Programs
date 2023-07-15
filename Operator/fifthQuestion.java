package Operator;

import java.util.Scanner;

public class fifthQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = x ^ y;
		int count = 0;
		
		while(n!=0)
		{
			n = n & (n - 1);
			count++;
		}
		System.out.println(count);
	}

}

//Note : This program solution i am viewed your website because out of syllabus 