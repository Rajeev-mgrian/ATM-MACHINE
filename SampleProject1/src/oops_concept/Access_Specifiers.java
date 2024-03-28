package oops_concept;

public class Access_Specifiers {
	/*
	 * public Access
	 * Default Access/No Access specifiers
	 * Private Access
	 * Protected Access
	 */
	public void  Dothispublic() {
		System.out.println("public method");
	}
	private void Dothisprivate() {
		System.out.println("private method");
	}
	void DoThisDefault() {
		System.out.println("default method");
		}
	}
public class access{
	public static void main(String []args) {
		Access_Specifiers a=new Access_Specifiers();
		a.Dothispublic();
//		a.Dothisprivate();
		a.DoThisDefault();
	}
}
