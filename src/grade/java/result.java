package grade.java;

import java.util.Scanner;

public class result {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks:");
		int a= sc.nextInt();
		if(a>90) {
			System.out.println("Grade A");
		
		}
		else if(a<90 && a>80) {
			System.out.println("Grade B");
		}
		else if(a<80 && a>70) {
			System.out.println("Grade C");
			
		}
		else if(a<70 && a>60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
	}

}
