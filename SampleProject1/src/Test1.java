
public class Test1 {
	String color;
	int age;
	public void instObj(String c, int a) {
		color=c;
		age=a;
	}
	public void display() {
		System.out.println(color + " " + age);
	
	}
	public static void main(String args[]) {
		Test1 buzo=new Test1();
		buzo.instObj("black", 10);
		buzo.display();
	}
	
	

}
