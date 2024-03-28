package fresh;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num=16 ;
		boolean checker=false;
		if(num==2) {
			System.out.println("prime number");
		}
		if(num>2) {
			System.out.println(Math.sqrt(num));
		for(int i=2; i<Math.sqrt(num); i++) {
			if(num%i!=0) {
				checker=true;
			}
			else {
				System.out.println("not a primt number");
				break;
			}
		}
		}
		if(checker)
	System.out.println("prime number = " + num);
	}

}
