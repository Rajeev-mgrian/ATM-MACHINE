 package pkg1;
 import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		Random r1=new Random();
		for(int i=0; i<=100; i++) {
			System.out.println(r1.nextInt(9000)+1000);
		}

	}

}
