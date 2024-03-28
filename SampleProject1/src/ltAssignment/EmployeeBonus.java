package ltAssignment;
import java.util.Scanner;
public class EmployeeBonus {
		 // function to calculate bonus based on designation
		 public static double calculateBonus(double salary, String designation) {
		 if (designation.equals("M")) {
		 return salary * 0.1;
		 } else if (designation.equals("TL")) {
		 return salary * 0.15;
		 } else if (designation.equals("SSE")) {
		 return salary * 0.17;
		 } else if (designation.equals("SE")) {
		 return salary * 0.2;
		 } else {
		 return 0.0;
		 }
		 }
		 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter the number of employees to process: ");
		 int numEmployees = input.nextInt();
		 for (int i = 1; i <= numEmployees; i++) {
		 System.out.println("\nEmployee " + i + " Details:");
		 System.out.print("Name: Rajeev Kumar");
		 String name = input.next();
		 System.out.print("ID:191121101074 ");
		 int id = input.nextInt();
		 System.out.print("Address: Muzaffarpur");
		 String address = input.next();
		 System.out.print("Department (DEV, MAINT, TEST, DEPLOY): IT ");
		 String department = input.next();
		 System.out.print("Designation (M, TL, SSE, SE): student ");
		 String designation = input.next();
		 System.out.print("Email ID: rajeevji3149@gmail.com ");
		 String email = input.next();
		 System.out.print("Salary: 15000 ");
		 double salary = input.nextDouble();
		 double bonus = calculateBonus(salary, designation);
		 double totalSalary = salary + bonus;
		 System.out.println("\nEmployee " + i + " Bonus Details:");
		 System.out.println("Name: " + name);
		 System.out.println("ID: " + id);
		 System.out.println("Address: " + address);
		 System.out.println("Department: " + department);
		 System.out.println("Designation: " + designation);
		 System.out.println("Email ID: " + email);
		 System.out.println("Salary: " + salary);
		 System.out.println("Bonus: " + bonus);
		 System.out.println("Total Salary: " + totalSalary);
		 }
		 input.close();
		 }
		}
