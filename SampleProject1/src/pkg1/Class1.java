package pkg1;
import java.util.Scanner;

public class Class1 {
	public static void calculateOdd(int n) {
	int sum=0;
	for(int i=1; i<=n; i++) {
		if(i%2==0) {
			sum=sum+i;
		}
	  }
	System.out.println(sum);
		
	return;
	}

	public static void main(String[] args) {
//		System.out.println("Hello worls");
//		System.out.println("Hello Rajeev");
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		  calculateOdd(n);

	}

}
