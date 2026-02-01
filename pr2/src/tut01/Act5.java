package tut01;

import java.util.Scanner;

public class Act5 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("How many eggs do you have? ");
	        int eggs = scanner.nextInt();

	        int gross = eggs / 144;
	        int remainderAfterGross = eggs % 144;

	        int dozen = remainderAfterGross / 12;
	        int leftover = remainderAfterGross % 12;

	        System.out.println(
	            "Your number of eggs is " +
	            gross + " gross, " +
	            dozen + " dozen, and " +
	            leftover +
	            " since " + eggs +
	            " is equal to " +
	            gross + "*144 + " +
	            dozen + "*12 + " +
	            leftover + "."
	        );
	        scanner.close();
	    }
}
