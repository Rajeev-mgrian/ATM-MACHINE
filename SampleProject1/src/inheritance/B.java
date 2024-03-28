package inheritance;

public class B extends A{
	int i=20; 
	public void show() {
		System.out.println(i	);
		System.out.println(super.i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		B obj=new B();
		obj.show();
	}

}
