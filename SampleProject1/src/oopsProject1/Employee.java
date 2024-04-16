package oopsProject1;
import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements utility{
	String emp_name;
	String emp_id;
	int emp_age;
	String emp_department;
	
	@Override
	public void get_details() {
		System.out.println("name: " +emp_name);
		System.out.println("id: "+emp_id);
		System.out.println("age: " +emp_age);
		System.out.println("department "+emp_department);
		System.out.println("Showroom name: "+showroom_name);
	}
	
	@Override
	public void set_details() {
		Scanner sc = new Scanner(System.in);
		UUID uuid = UUID.randomUUID();
		emp_id = String.valueOf(uuid);
		System.out.println("============ *** ENTER EMPLOYEE DETAILS *** ============");
		System.out.println();
		System.out.print("Employee name: ");
		emp_name=sc.nextLine();
		System.out.print(("Employee Age "));
		emp_age=sc.nextInt();
		sc.nextLine();
		System.out.println("Employee Department: ");
		emp_department=sc.nextLine();
		System.out.print("Showroom Name: ");
		showroom_name=sc.nextLine();
		
	}
}
