package start;
public class Cars {
	public static void main(String [] args) {
		Car c1=new Car();
		Car c2=new Car();
		System.out.println("First Car And Brand");
		c1.Name = "NEXON";
		c1.Brand = "TATA";
		c1.Model= 2019;
		c1.Color = "WHITE";
		c1.show();
		System.out.println(" ");
		System.out.println("2nd Car And Brand");
		c2.Name = "Breza";
		c2.Brand = "Suzuki";
		c2.Model = 2023;
		c2.Color = "Black";
		c2.show();

	}
}
