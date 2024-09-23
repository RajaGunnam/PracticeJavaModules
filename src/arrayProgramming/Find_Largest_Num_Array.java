package arrayProgramming;

public class Find_Largest_Num_Array {
	
	public static void main(String args[]) {
		
	
	int number[] = {12, 21, 22, 2, 54};
	
	int max = number[0];
	
	for(int i=1; i<number.length; i++) {
		
		if(number[i]>max) {
			max=number[i];
		}
	}
	System.out.println(max);
	
	}
}
