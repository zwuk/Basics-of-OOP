package by.zvv.javaonline.part05.task04.logic;

import java.util.Scanner;

public class UserInput {

	public int getInt() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
		}
		return sc.nextInt();
	}

}
