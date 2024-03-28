package abstraction;

public class scooter extends Vehicle{
	public void start() {
		System.out.println("scooter start with kick");
	}
	public static void main(String[] args) {
		car c1=new car();
		c1.start();
		scooter s1=new scooter();
		s1.start();
	}
}
