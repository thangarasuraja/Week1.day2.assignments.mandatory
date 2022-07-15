package Week1.day2.assignments.mandatory;

import java.util.Iterator;

public class ReverseEvenWords {
	

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] str=test.split(" ");
		String str2="";
		for (int i =0; i<=str.length-1; i++) {
			if(i%2==1) {
				str2="";
				char[] c=str[i].toCharArray();
				for (int j = c.length-1; j>=0; j--) {
					str2=str2+ c[j];
				}
				System.out.print(str2+" ");	
			}
			else {
				System.out.print(str[i]+" ");
			}

		}
	}

}
