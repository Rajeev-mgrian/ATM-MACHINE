package inheritance;

public class Class2 extends Class1 {
	public void  substraction() {
		System.out.println("the substraction is: " +( num1-num2));
	}
	public static void main(String [] args) {
		Class2 obj1=new Class2();
		obj1.addition();
		obj1.substraction();
	}

}
