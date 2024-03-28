package start;
import java.util.*;

class ATM{
	float Balance;
	int PIN = 3149;
	
	public void checkPIN() {
		System.out.println("Enter your PIN");
		Scanner sc=new Scanner(System.in);
		int enteredPIN=sc.nextInt();
		if(enteredPIN==PIN) {
			menu();
		}
		else {
			System.out.println("Enter a valid PIN");
			checkPIN();
		}
	}
	public void menu() {
		System.out.println("Emter your choice");
		System.out.println("1 : Check A/C Balance");
		System.out.println("2 : Withdraw Amount");
		System.out.println("3 : Deposit Amount");
		System.out.println("4 : exit");
		
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		if(opt==1) {
			checkBalance();
		}
		else if(opt==2) {
			withdrawAmount();
		}
		else if(opt==3) {
			depositAmount();
		}
		else if(opt==4) {
			return;
		}
		else {
			System.out.println("Enter a valid choice");
		}
		menu();
	}
	public void checkBalance() {
		System.out.println("Balance : " + Balance);
		menu();
	}
	public void withdrawAmount() {
		System.out.println("Enter amount to withdraw");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		if(amount>Balance) {
			System.out.println("indufficient Balance");
		}
		else {
			Balance=Balance-amount;
			System.out.println("Amount successfully withdraw");
		}
		menu();
	}
	public void depositAmount() {
		System.out.println("Enter amount ");
		Scanner sc=new Scanner(System.in);
		Float amount=sc.nextFloat();
		Balance=Balance+amount;
		System.out.println("Deposited amount sucessfully");
		menu();
	}
	
}
public class ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM obj=new ATM();
		obj.checkPIN();
		}

}
