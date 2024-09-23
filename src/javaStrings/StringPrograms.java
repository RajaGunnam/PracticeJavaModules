package javaStrings;

public class StringPrograms {
	
	static int count=0;
	static String s="java is fun and interesting";
	
	
	public static void main(String args[]) {
		//Print the count of repeated letters in given string
//		for(int i=0;i<s.length(); i++) {
//			if(s.charAt(i)=='a' || s.charAt(i)=='A') {
//				count++;
//			}
//		}
//		
//		System.out.println("Number of repeated words - " +count);
		
		//Print vowels and count vowels in a given string
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' ||  s.charAt(i)=='e' ||s.charAt(i)=='i'||
					s.charAt(i)=='o' ||s.charAt(i)=='u') {
				
				System.out.println("Vowels are - "+s.charAt(i));
				count++;
			}
		}
		System.out.println("Vowels count in a given string - "+ count); 
		
	}

}
