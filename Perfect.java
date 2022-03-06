// Program to check given number is perfect number or not   

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
	    
		  Scanner s=new Scanner(System.in);
		  
		  System.out.println("Enter number to check it is perfect numeber or not");
		  int num=s.nextInt();
		  int sum=0;
		  for(int i=1;i<=num/2;i++) {   //500
			  if(num%i==0) {
				 sum=sum+i;  
			  }
		  }
		  if(sum==num) {
			  System.out.println("perfect number");
		  }
		  else {
			  System.out.println("Not a perfect number");
		  }
		
		
	}

}
