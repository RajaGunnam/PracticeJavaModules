package javaStrings;

public class StringProgramming {
	public static void main(String[] args) {
		
	//By String Literals - Only One object is created
	String s1 = "Learn Java";
	String s2 = "Learn Java";
	
	System.out.println(s1);
	System.out.println(s2.hashCode());
	
	//By New Keyword - New objects are created and one reference variable
	
	String s3 = new String("Sring constant pool Area"); 
	System.out.println(s3);
	System.out.println(s3.hashCode());
	
	//converting char array to string
	
	char[] ch = {'r', 'a', 'j', 'a'};
	System.out.println(new String(ch));
	
	
	
	//String are immutable
	
	String v1 = "Ahex";
	v1.concat("Technologies");
	System.out.println(v1); //here new instance is created but still the variable v1 is referrig to ahex only
	
	//Here we have to declare explicitly
	
	v1 = v1.concat(" Technologies");
	
	System.out.println(v1);
	
	StringProgramming sp = new StringProgramming();
	sp.mutableStrings();
	
	}
	
	// Mutable string - String buffer
	public void mutableStrings() {
		StringBuffer sb = new StringBuffer("Raja");
		sb.append(" Gunnam");
		System.out.println(sb);
	}
	
}
