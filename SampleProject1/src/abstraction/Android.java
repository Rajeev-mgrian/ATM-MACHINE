package abstraction;

public class Android extends Mobile{
	public void doubleTap() {
		System.out.println("android double tap");
	}
	public static void main(String[] args) {
		Mobile m;
		m=new Ios();
		m.doubleTap();
		
		m=new Android();
		m.doubleTap();
	}

}
