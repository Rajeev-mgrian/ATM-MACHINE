package pkg1;

public class StringBuilderClass {

	public static void main(String[] args) {
		/*StringBuilder class is used to create mutable(modifiable string
		 * Some useful methods:
		 * append,insert, replace, delete, reverse
		 */
		StringBuilder obj=new StringBuilder("I ");
		obj.append("Like ");
		obj.append("java ");
		System.out.println(obj);
		
		StringBuilder sb1=new StringBuilder("Learning is fun");
		sb1.insert(9, "java ");
		System.out.println(sb1);
		
		sb1.replace(9,13,"everything");
		System.out.println(sb1);
		
		sb1.deleteCharAt(0);
		System.out.println(sb1);
		
		sb1.delete(2,10);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
	}

}
