package oops_concept;

public class Method_overloading {
	public void addition(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void addition(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public void addition(int num1, double num2) {
		System.out.println(num1+num2);
	}
	public void addition(double num1, int num2) {
		System.out.println(num1+num2);
	}
	public void addition(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}

}
