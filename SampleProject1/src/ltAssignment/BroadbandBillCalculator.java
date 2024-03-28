package ltAssignment;
import java.util.Scanner;
	public class BroadbandBillCalculator {
		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
			 System.out.print("Enter the total data usage in MB per month: ");
			 int totalDataUsage = scanner.nextInt();
			 if (totalDataUsage <= 0) {
			 System.out.println(totalDataUsage + " is not a valid input");
			 return;
			 }
			 int billAmount = 500; 
			 int freeUsageLimit = 1024; 
			 int additionalUsageCost = 250; 
			 int extraUsageCost = 3; 
			 if (totalDataUsage > freeUsageLimit) {
			 billAmount += additionalUsageCost; 
			 int additionalUsage = totalDataUsage - freeUsageLimit;
			 if (additionalUsage > freeUsageLimit) {
			 int extraUsage = additionalUsage - freeUsageLimit;
			 int extraCost = extraUsage * extraUsageCost;
			 billAmount += extraCost;
			 }
			 }
			 System.out.println("Total bill amount: " + billAmount + " rupees");
			 }
			}