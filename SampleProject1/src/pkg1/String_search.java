package pkg1;

public class String_search {

	public static void main(String[] args) {
		/*
		 * contains
		 * Starts with
		 * Ends with
		 * Index of
		 * Last Index of
		 */
		String str1 = "I love java love and sql";
		String str2 = "java";
		System.out.println(str1.contains(str2));
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
		
//		startsWith
		
		System.out.println(str1.startsWith("I"));
		
//		EndsWith
		
		System.out.println(str1.endsWith("java"));
		
//		Index of
		
		System.out.println(str1.indexOf("love"));
		
//		last index of
		
		System.out.println(str1.lastIndexOf("love"));
	}
}
