package oops_concept;

public class bank_account {
	private long acNo;
	private String acName;
	private double acBalance;
	public void deposit(double amt) {
		if(amt>0) {
			acBalance=acBalance+amt;
			System.out.println("successfully deposited amount $ : " + amt);
		}
		else {
			System.out.println("cannot deposit " + amt);
		}
		
	}
	public void withdraw(double amt) {
		 if(amt>0) {
			 acBalance=acBalance-amt;
			 System.out.println("successfully withdraw $ : " + amt);
			 
		 }
		 else {
			 System.out.println("cannot withdraw");
		 }
	}
	public void displayCurrentBalance() {
		System.out.println("your current balance is $ " + acBalance);
		 		
	}
	public bank_account(long acNo, String acName, double acBalance) {
		 this.acNo=acNo;
		 this.acName=acName;
		 this.acBalance=acBalance;
	}
}
