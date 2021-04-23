package co.vanila;

import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("=============");
		for (int i = 0; i < 3; i++) {
			String s1 = s.next();
			int i1 = s.nextInt();
			System.out.printf("%-15s%03d%n",s1,i1);
			

		}
		System.out.println("============");

	}

}
