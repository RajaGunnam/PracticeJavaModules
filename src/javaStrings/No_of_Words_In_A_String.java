package javaStrings;

public class No_of_Words_In_A_String {

	static String s1 ="  Raja Gunnam  ";
	static int count = 1;
	public static void main(String args[]) {
		
		String s2 = s1.trim();
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		for(int i=0;i<s2.length();i++) {
			
			if(s2.charAt(i)==' ' && s2.charAt(i+1)!= ' ') {
			count++;
			}
			
		}
		System.out.println("Count without removing white spaces - "+count);
	}
}
