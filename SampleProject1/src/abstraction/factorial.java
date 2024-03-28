package abstraction;
import java.util.Scanner;
public class factorial {
	public static void calFactorial(int n) {
		if(n<0) {
			System.out.println("invalid number");
			return;
		}
		int factorial=1;
		for(int i=n; i<=1; i--) {
			
			factorial=factorial*i;
		}
		System.out.println(factorial);
		return;
		}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		calFactorial(n);

	}

}
