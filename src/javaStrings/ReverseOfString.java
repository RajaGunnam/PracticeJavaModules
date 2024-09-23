package javaStrings;

public class ReverseOfString {

	public static void main(String args[]) {
	
	String s= "MoM";
	
	String rev="";
	
	for(int i =s.length()-1; i>=0; i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println("Reverse of a String - "+ rev);
	
	if(s.equals(rev)) {
		System.out.println("This is a palindrome string");
	}
	
	else
	{
		System.out.println("Not a palindrome string");
	}
	
	}
	
}
