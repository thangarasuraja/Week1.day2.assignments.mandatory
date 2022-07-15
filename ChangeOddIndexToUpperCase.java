package Week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {
	/*
	 *1)Declare a string input.
	 *2)Convert the string to character array.
	 *3)Send the character into the loop.
	 *4)Check whether the index of the character is odd or not with in the loop.
	 *5)Change the odd index character to uppercase and print.
	 */

	public static void main(String[] args) {

		String test="changeme";
		String str="";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0) {
				str+=Character.toUpperCase(charArray[i]);
			}
			else {
				str+=Character.toLowerCase(charArray[i]);
			}
		}
		test=str;
		System.out.println(test);
	}
}
