package inheritance;

public class Consumer {
		 private String name;
		 private int units;
		 private double bill;
		 
		 // Constructor
		 public Consumer(String name, int units) {
		 this.name = name;
		 this.units = units;
		 this.bill = 0.0;
		 }
		 
		 // Getter for name
		 public String getName() {
		 return this.name;
		 }
		 
		 // Getter for units
		 public int getUnits() {
		 return this.units;
		 }
		 
		 // Getter for bill
		 public double getBill() {
		 return this.bill;
		 }
		 
		 // Method to accept input and create object
		 public void accept() {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter customer name: ");
		 String name = scanner.nextLine();
		 
		 System.out.print("Enter units consumed: ");
		 int units = scanner.nextInt();
		 
		 Consumer consumer = new Consumer(name, units);
		 
		 scanner.close();
		 }
		 
		 // Method to calculate bill amount
		 public void calculate() {
		 if (this.units <= 100) {
		 this.bill = this.units * 1.5;
		 } else if (this.units <= 300) {
		 this.bill = 100 * 1.5 + (this.units - 100) * 2.5;
		 } else {
		 this.bill = 100 * 1.5 + 200 * 2.5 + (this.units - 300) * 4.5;
		 }
		 }
		 
		 // Method to print output
		 public void print() {
		 System.out.println("Customer Name: " + this.name);
		 System.out.println("Units Consumed: " + this.units);
		 System.out.println("Bill Amount: " + this.bill);
		 }
		}
