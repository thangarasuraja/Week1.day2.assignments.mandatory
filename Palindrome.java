package Week1.day2.assignments.mandatory;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPrOriginal;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";

		String rev="";
		char[] charArray=str.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			rev=rev+str.charAt(i);

		}
		if(str.equals(rev)) {
			System.out.println("It is a polindrome ");
		}
		else {
			System.out.println("It is not a polindrome");

		}
	}

}

