package tut01;

import java.util.Scanner;

public class Act4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name: \n");
		String name = sc.next();
		System.out.printf("Hello, %s, nice to meet you!", name.toUpperCase());
	}
}
