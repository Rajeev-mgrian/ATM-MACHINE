package pkg1;

public class Employee {
	int eid;
	String empname;
	Employee(int id, String name){
		eid=id;
		empname=name;
		System.out.println(eid+" " +empname);
	}
	Employee(Employee emp){
		System.out.println("copy constructor");
		System.out.println(emp.eid+ " " + emp.empname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1," shivam ");
		Employee emp2=new Employee(emp1);
	}
}
