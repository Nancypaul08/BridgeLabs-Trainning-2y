package week.java;

import java.util.Scanner;

public class day {
	public static void main(String[]agrs){
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter your number ");
		for(int i =1; i<=5 ; i++) {
			if( i == 3) {
				System.out.println("Skipping 3");
				continue;
			}
			
			if(i == 5) {
				System.out.println(" Breaking at 5");
				break;
			}
			System.out.println("i:"+i);
		}
		
		
		
		
	}
}
