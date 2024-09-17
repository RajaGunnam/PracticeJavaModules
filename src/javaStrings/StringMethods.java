package javaStrings;

public class StringMethods {
	
	public static void main(String[] args) {
		
		
		//To find the length of the string
		String s1 = "Rajahmundry";
		System.out.println("the length of the string is - "+s1.length());
		
		//Concatenation
		System.out.println(s1.concat(", East Godavari"));
		
		//To know the specific character at specific index
		System.out.println(s1.charAt(2));
		
		StringMethods sm = new StringMethods();
		sm.countRepeatedChars();
		
		sm.vowelsCount();
		
		sm.reverseOfAString();
		
		sm.compareStrings();
		
		sm.checkPallindromeString();
		
	}
	
	//To check the count of repeated words
	public void countRepeatedChars() {
		
		String s2 = "JavaEEdeve";
		int count = 0;
		for(int i=0; i<s2.length(); i++) {
				if(s2.charAt(i)== 'e' || s2.charAt(i)=='E') {
					count++;
				}
			}
			 System.out.println(count);
		
	}
	
	//To print the vowels and vowels count in a word
	
	public void vowelsCount() {
		String s3 ="javadev";
		int count =0;
		for (int i=0; i<s3.length(); i++) {
			if(s3.charAt(i)=='a' ||s3.charAt(i)=='e'||s3.charAt(i)=='i'||
					s3.charAt(i)=='o'||s3.charAt(i)=='u') {
				System.out.println("Vowel in a given word - "+s3.charAt(i));
				count++;
				
			}
			
		}
		System.out.println(count);
	}
	
	//WAP to reverse of a string
	public void reverseOfAString() {
	String s4 = "Raja Gunnam";
	String rev ="";
	for(int i=s4.length()-1; i>=0;i--) {
		rev=rev+s4.charAt(i);
		
	}
	System.out.println(rev);
	}
	
	//compare two strings based on the data
	
	String s5 = "Raja";
	String s6 = "raja";
	
	public void compareStrings() {
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
	}
	
	//WAP to check the given string is a pallindrome or not
	
	String s7 = "madam";
	String rev="";
	public void checkPallindromeString() {
		for(int i=s7.length()-1;i>=0;i--) {
			rev=rev+s7.charAt(i);
		}
		System.out.println(rev);
		
		if (s7.equalsIgnoreCase(rev)) {
			System.out.println("Given String is a pallindrome String");
		}
		else {
			System.out.println("Given String is not a pallindrome String");
		}
	}
	
}
