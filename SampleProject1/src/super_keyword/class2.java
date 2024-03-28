package super_keyword;

public class class2 extends class1{
	public class2(int a) {
		super(a);    
		System.out.println(a);
	}
	public void show2() {
		System.out.println("b is executed");
	}
	public static void main(String[] args) {
		class2 obj=new class2(20);
		obj.show2();
		obj.show1();
		
	}

}
