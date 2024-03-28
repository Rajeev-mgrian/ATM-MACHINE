package oops_concept;

public class bank_account_main {

	public static void main(String[] args) {
		bank_account b1=new bank_account(50873149, "Rajeev", 10000);
		b1.displayCurrentBalance();
		b1.deposit(2000);
		b1.displayCurrentBalance();
		b1.withdraw(3000);
		b1.displayCurrentBalance();
		b1.deposit(-1000);
		b1.displayCurrentBalance();
	}

}
