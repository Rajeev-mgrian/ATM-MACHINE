package oops_concept;

public class Employee_Main {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.name="Rajan";
		emp1.id=1073;
		emp1.salary=75000;
		emp1.displayBonus();
		
		emp2.name="Kaushal";
		emp2.id=1036;
		emp2.salary=80000;
		emp2.displayBonus();
	}

}
