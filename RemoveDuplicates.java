package Week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[]array=text.split(" ");
		for (int i = 0; i <= array.length-1; i++) {
			count=0;
			for ( int j=i+1; j <= array.length-1; j++) {
				    
				if(array[i].equals(array[j])){
					
				count=count+1;
                    break;
				}
			}
			if(count>=1) {
			text =text.replaceFirst(array[i],"");
			}
			
		}
		System.out.println(text);
	}
}


