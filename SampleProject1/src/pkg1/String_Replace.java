package pkg1;

public class String_Replace {

	public static void main(String[] args) {
		/*
		 * Replace - Normal
		 * ReplaceAll - Regx
		 */
		String str1 = "CONCENTRAT1234ON 1234MPROVE W1234TH PRACT1234CE";
		String str2 = "1234";
		String str3 = "I";
		System.out.println(str1.replace(str2, str3));
		
//		ReplaceAll
		
		String str4 = "EI#$T%HER #YO&*U CON#$TR^OL Y$OUR* #M%IN*D O^R& I%*^^^^(T  W%I(*)L%L ()C^O#%T$R^@EOL YO%U#";
		String patt = "[^A-Za-z0-9\\s]";
		System.out.println(str4.replaceAll(patt,""));

	}

}
