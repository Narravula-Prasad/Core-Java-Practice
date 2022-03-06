//Program to print number of notes for given amount

/*
ATM:   500 200 100
1000  ---> 500- 2
700   -->  500-1  200-1
1800 -->  500-3  200-1  100-1
*/

import java.util.Scanner;

public class Notes {

	public static void main(String[] args) {
	    
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter withdraw amount");
		int amount=s.nextInt();
		int a=0,b=0,c=0;
		if(amount%100==0) {        //1800  
			if(amount>=500) {
				a=amount/500;
				amount=amount-(a*500);
				System.out.println("500 rupees notes are: "+a);
			}
			if(amount>=200) {
				b=amount/200;
				amount=amount-(b*200);
				System.out.println("200 rupees notes are: "+b);
			}
			if(amount>=100) {
				c=amount/100;
				System.out.println("100 rupees notes are: "+c);
			}
		}
		else {
			System.out.println("Please enter multiples of 100 only");
		}
		
		
		
	}

}