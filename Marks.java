//Program To Check Given Marks are Valid or Not

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
	    
		Scanner s=new Scanner(System.in);
		int marks=0;
		
		System.out.print("Enter your marks");
		marks=s.nextInt();
		 
		if(marks>=0 && marks<=100) {                      //190
			System.out.println("Valid marks");
		}
		else {
			System.out.println("invalid marks");
		}
		
	}

}