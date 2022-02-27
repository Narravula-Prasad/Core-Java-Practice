//PROGRAM FOR ATM
import java.util.Scanner;

public class ATM {
	int bal=10000;
	int count=0;
	Scanner s=new Scanner(System.in);
	public void validate() {
	System.out.println("ENTER PIN");
	int pin=s.nextInt();
	if (pin==4321) {
		
		options();
	}
	else
	{
		System.out.println("INVALID PIN");
		count=count+1;
		if(count<3) {
		System.out.println("REMAINING CHANCES : "+(3-count));
		}
		if(count<3) {
			validate();
		} else {
			System.out.println("ACCOUNT BLOCKED");
		}
		
	}
	}
	
	public void options() {
		
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.BalQuery");
		System.out.println("0.Exit");
		System.out.println("Enter your option");
		int a=s.nextInt();
		switch(a)
		{
		case 1: Deposit();
				continue1();
				break;
		case 2: Withdraw();
				continue1();
				break;
		case 3: BalQuery();
				continue1();
				break;
		case 0: System.out.println("THANK YOU , VISIT AGAIN");
				break;
		default : System.out.println("INVALID KEY");
		 				break;
		
		}
	}
	public void Deposit() {
		System.out.println("ENTER DEPOSIT AMOUNT");
		int b=s.nextInt();
		if(b%100==0) {
			if(b<=50000) {
				bal=bal+b;
			}else
			{
				System.out.println("MAX DEPOSIT LIMIT 50000 ONLY");
			}
			
		} else {
			System.out.println("PLS ENTER MULTIPLES OF 100");
		}
		
		System.out.println("TOTAL BALENCE IS "+bal);
		
	}
	public void Withdraw() {
		System.out.println("ENTER WITHDRAW AMOUNT");
		int d=s.nextInt();
		if(d%100==0) {
			if(d<=20000) {
				bal=bal-d;
			}else
			{
				System.out.println("MAX DEPOSIT LIMIT 20000 ONLY");
			}
			
		} else {
			System.out.println("PLS ENTER MULTIPLES OF 100");
		}
		
		System.out.println("TOTAL BALENCE IS "+bal);
	}
	public void BalQuery() {
		
		System.out.println("TOTAL BALENCE IS "+bal);
	}
	public void continue1() {
		System.out.println("1.CONTINUE 2.EXIT");
		int c=s.nextInt();
		switch(c) {
		case 1: options();
				break;
		case 2: System.out.println("THANK YOU");
				break;
		default:System.out.println("INVALID KEY");
		 		break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM obj=new ATM();
		obj.validate();

	}

}
