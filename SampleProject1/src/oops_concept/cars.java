package oops_concept;

public class cars {
	String color = "white";
	String make = "honda";
	String type = "suv";
	public void displayDetails() {
		System.out.println(" i have a "+ make +" " + type + " of "+ color + " color ");
	}

	public static void main(String [] args) {
		cars c1=new cars();
		c1.color="red";
		c1.make="BMW";
		c1.displayDetails();
		
		cars c2=new cars();
		
		c2.color="orange";
		c2.make="toyota";
		c2.type="sadan";
		c2.displayDetails();
		
		
	}
}
