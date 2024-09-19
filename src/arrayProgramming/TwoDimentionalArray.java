package arrayProgramming;

public class TwoDimentionalArray {

	public static void main(String args[]) {
		int arr[][]= new int[3][4];
		
		arr[0][0]=21;
		arr[0][1]=22;
		arr[0][2]=23;
		arr[0][3]=24;
		
		arr[1][0]=31;
		arr[1][1]=32;
		arr[1][2]=33;
		arr[1][3]=34;
		
		arr[2][0]=41;
		arr[2][1]=42;
		arr[2][2]=43;
		arr[2][3]=44;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("This is with for each loop or enahanced loop");
		for(int data[]: arr) {
			for(int data1: data) {
				System.out.print(data1 +" ");
			}
			System.out.println();
		}
		
	}
}
