package ltAssignment;
import java.util.Scanner;
public class AgeGenderOutput {
	 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

	 // Prompt the user to enter the number of times to repeat the input
	 System.out.print("Enter the number of times to repeat: ");
	 int n = scanner.nextInt();

	 for (int i = 1; i <= n; i++) {
	 // Prompt the user to input name, age, and gender
	 System.out.println("\nEnter details for person #" + i + ":");
	 System.out.print("Enter name: ");
	 String name = scanner.next();
	 System.out.print("Enter age: ");
	 int age = scanner.nextInt();
	 System.out.print("Enter gender (M/F): ");
	 char gender = scanner.next().charAt(0);

	 // Determine the appropriate message based on the age and gender
	 String message = "";
	 if (gender == 'M') {
	 if (age < 5) {
	 message = "Baby " + name + ", you are baby to code";
	 } else if (age >= 6 && age <= 15) {
	 message = "Master " + name + ", you are kid to code";
	 } else if (age >= 16 && age <= 18) {
	 message = "Hi " + name + ", you are Teen to code";
	 } else {
	 message = "Mr." + name + ", you are Adult to code";
	 }
	 } else if (gender == 'F') {
	 if (age < 5) {
	 message = "Baby " + name + ", you are baby to code";
	 } else if (age >= 6 && age <= 15) {
	 message = "Miss " + name + ", you are kid to code";
	 } else if (age >= 16 && age <= 18) {
	 message = "Hi " + name + ", you are Teen to code";
	 } else {
	 message = "Ms." + name + ", you are Adult to code";
	 }
	 }
	 // Print the message
	 System.out.println(message);
	 }

	 scanner.close();
	 }
}
