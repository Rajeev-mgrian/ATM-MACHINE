package ltAssignment;

public class NumericTypes {
		 public static void main(String[] args) {
		 int i = 11;
		 float f = 4.14f;
		 char c = 'B';
		 // Addition
		 float sum = i + f + c;
		 System.out.println("Sum: " + sum);
		 // Subtraction
		 int diff = i - c;
		 System.out.println("Difference: " + diff);
		 // Multiplication
		 float product = i * f;
		 System.out.println("Product: " + product);
		 // Division
		 float quotient = f / i;
		 System.out.println("Quotient: " + quotient);
		 // Modulus
		 int remainder = i % 3;
		 System.out.println("Remainder: " + remainder);
		 // Precedence
		 float result = i + f * c / 2 - i / 2 % 3;
		 System.out.println("Result: " + result);
		 }
		}
