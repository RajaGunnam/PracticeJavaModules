package arrayProgramming;

public class JaggedArray {
	public static void main(String args[]) {

		int jag_arr[][] = new int[3][];
		
		 jag_arr[0] = new int[2];
		jag_arr[1] = new int[3];
		jag_arr[2] = new int[4];

		jag_arr[0][0] = 11;
		jag_arr[0][1] = 12;

		jag_arr[1][0] = 21;
		jag_arr[1][1] = 22;
		jag_arr[1][2] = 23;

		jag_arr[2][0] = 31;
		jag_arr[2][1] = 32;
		jag_arr[2][2] = 33;
		jag_arr[2][3] = 34;

		for (int i = 0; i <jag_arr.length; i++) {
			for (int j = 0; j <jag_arr[i].length; j++) {
				System.out.print(jag_arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}