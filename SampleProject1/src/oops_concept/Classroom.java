package oops_concept;

public class Classroom {
	String sub1;
	int stdcount;
	
	public String getsub() {
	return sub1;
	}
	
	public void setsub(String sub) {
		this.sub1=sub;
	}
	
	public int getstdcount() {
		return stdcount;
	}
	
	public void setstdcount(int stdcount){
	this.stdcount=stdcount;
	}
	
	public void displayDetails() {
		System.out.println("this is a " + sub1 +" classroom and it has "+ stdcount + " students ");
	}
	

}
