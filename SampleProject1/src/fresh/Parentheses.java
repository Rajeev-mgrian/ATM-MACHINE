package fresh;
import java.util.Scanner;
import java.util.Stack;
public class Parentheses {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the String");
		String inputStr=Sc.nextLine();
		int result=CheckParentheses(inputStr);
		System.out.println(result);
	}
	public static int CheckParentheses(String str) {
		Stack<Character> st=new Stack<>();
		for(int i=0; i<str.length(); i++) {
			char curr=str.charAt(i);
			if(curr=='(') {
				st.push(curr);
			}
			else if(curr==')') {
				if(st.isEmpty() || st.peek()!='(') {
				return 1;
			}
			st.pop();
			}
		}
	
		return st.isEmpty()?0:1;
		
	}

}
