package pkg1;

public class string_comparison {

	public static void main(String[] args) {
		/*
		 * Equals
		 * compare to
		 * matches
		 */

		String str1 = "ABCDE";
		String str2 = "ABCDE";
		System.out.println(str1.equals(str2)); 
		
		System.out.println(str1.equalsIgnoreCase(str2));
		if(str1.equals(str2)) {
			System.out.println("Strings are equals");
		}else {
			System.out.println("Strings are not equals");
		}
		// compare To
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		//matches
		
		String patt = "[A-Z]{1,}";
		System.out.println(str1.matches(str2));
		 
	}

}
