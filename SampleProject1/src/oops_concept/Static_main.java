package oops_concept;

public class Static_main {

	public static void main(String[] args) {
		Static_Keyword sk1=new Static_Keyword();
		Static_Keyword sk2=new Static_Keyword();
		sk1.age=22;
		sk1.grade="2nd";
		Static_Keyword.name="Raj";
		Static_Keyword.doThis();
		
	
		sk2.age= 23;
		sk2.grade="3rd";
        sk2.name="Kaushal";
        Static_Keyword.doThis();
        sk1.display();
        sk2.display();
        
	}

}
