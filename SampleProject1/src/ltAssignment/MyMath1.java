package ltAssignment;

public class MyMath1 {

	    public static int add(int a, int b) {
	        return a + b;
	    }

	    public static int subtract(int a, int b) {
	        return a - b;
	    }

	    public static int multiply(int a, int b) {
	        return a * b;
	    }

	    public static double divide(double a, double b) {
	        return a / b;
	    }

	    public static int add(int... numbers) {
	        int result = 0;
	        for (int number : numbers) {
	            result += number;
	        }
	        return result;
	    }
	}


