package pkg1;

public class String_slice {

	public static void main(String[] args) {
		/*
		 * Char at
		 * sunstring
		 * split
		 */
		
		String str1 = "ABCDEFG";
		System.out.println(str1.charAt(3));
		
//		write a program to reverse a string
		
		 String temp="";
		 for(int i=0; i<=str1.length()-1; i++) {
			 temp=str1.charAt(i)+temp;
		 }
		 System.out.println(temp);
		 
//		 substring
		 
		 System.out.println(str1.substring(2));
		 
		 System.out.println(str1.substring(2, 4));

//		 split
		 
		 String str2 = "A_B_C_D";
		 String str3 = "_";
		 String [] arr = str2.split(str3);
		 for(String x : arr) {
			 System.out.println(x);
		 }
	}
}
