package oops_concept;

public class Encap {
	private int emp_id;
	public int getemp_id() {
		return emp_id;	
	}
	public void setemp_id(int emp_id1) {
	this.emp_id=emp_id1;
	}
	public void display() {
		System.out.println(emp_id);
	}
}


