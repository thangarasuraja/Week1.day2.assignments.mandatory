package Week1.day2.assignments.mandatory;

public class FindIntersection {

	/*
	 *1)Declare a array1.
	 *2)Declare a array2.
	 *3)Find the length of the  array1.
	 *4)Find the length of the  array2.
	 *5)Declare the loop for array1.
	 *6)Declare the nested loop for array2.
	 *7)compare the array1 and array2 values .
	 *8)Print the intersection values.
	 *
	 */

	public static void main(String[] args) {
		int[]array1= {3,2,11,4,6,7};
		int[]array2= {1,2,8,4,9,7};
		int length1=array1.length;
		int length2=array2.length;
		for (int i = 0; i < length1; i++) {

			for (int j = 0; j < array2.length; j++) {

				if(array1[i]==array2[j]) {
					int c=array1[i];
					System.out.println(c);
				}
			}
		}

	}

}
