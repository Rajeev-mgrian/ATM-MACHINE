package fresh;

public class SwapNumber {

	public static void main(String[] args) {
		int num1=5;
		int num2=6;
		System.out.println("before swiping  num1  = " + num1 + " & num2 = " + num2);
//		first method
		
//		int temp=0;
//		temp =num1;
//		num1=num2;
//		num2=temp;
		
//		second method
		
//		num1= num1+num2;
//		num2= num1-num2;
//		num1= num1-num2;
		
//		third method
		
		num1= num1*num2;  //  5*6=30
		num2= num1/num2;  // 30/6=5
		num1= num1/num2;  //30/5=6
		
       System.out.println("after swaping num1 = " + num1 + " & num2 = " + num2 );
	}

}
