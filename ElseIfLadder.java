package packageCoreJava;

import java.util.Scanner;
public class ElseIfLadder {
	
	static int percent;

	public static void main (String []Args) {
		
		System.out.println("Enter the percent ");
		Scanner elf = new Scanner(System.in);
		percent=elf.nextInt();
		
		elf.close();
		
		if(percent>80) {
			System.out.println("Passed With First Class");
		}
		
		else if(percent>85) {
			System.out.println("Passed With Second Class");
		}
		
		else {
			System.out.println("Failed");
        }
}
}