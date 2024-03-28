package oops_concept;

public class Road_Toll {
	String type;
	int tiresCount;
	public void calculateToll() {
		if(tiresCount==2) {
			System.out.println("Your toll amount is 0");
		}
		else if(tiresCount==4) {
			System.out.println("Your toll amount is 10");
		}
		else if(tiresCount>4) {
			System.out.println("Yout toll amount is 20");
		}
		else {
			System.out.println("incorrect tires count");
		}
		
	}
	public Road_Toll() {
		System.out.println("constructor is executed");
	}
	public Road_Toll(String type, int tiresCount) {
		this.type=type;
		this.tiresCount=tiresCount;
		
	}
}
