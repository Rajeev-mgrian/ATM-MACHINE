package ltAssignment;

public class StringMethodsExample {
		 public static void main(String[] args) {
		 String value = "Learn new things will help to enhance our skills";

		 // Print the original string
		 System.out.println("Original string: " + value);

		 // Use the length() method to find the length of the string
		 int length = value.length();
		 System.out.println("Length of the string: " + length);

		 // Use the toUpperCase() method to convert the string to uppercase
		 String upperCase = value.toUpperCase();
		 System.out.println("Uppercase string: " + upperCase);

		 // Use the toLowerCase() method to convert the string to lowercase
		 String lowerCase = value.toLowerCase();
		 System.out.println("Lowercase string: " + lowerCase);

		 // Use the replace() method to replace a substring with another substring
		 String replaced = value.replace("enhance", "improve");
		 System.out.println("String with replaced substring: " + replaced);

		 // Use the substring() method to extract a part of the string
		 String substring = value.substring(6, 16);
		 System.out.println("Substring extracted from the original string: " + substring);

		 // Use the split() method to split the string into an array of substrings
		 String[] substrings = value.split(" ");
		 System.out.println("Array of substrings: ");
		 for (String substring1 : substrings) {
		 System.out.println(substring1);
		 }
		 }
		}
