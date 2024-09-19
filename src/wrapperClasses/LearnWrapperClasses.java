package wrapperClasses;

public class LearnWrapperClasses {
	
	public static void main(String args[]) {
		
		// Boxing Concept
		int i =100;
		Integer a = new Integer(i);
		System.out.println(a.valueOf(i));
		
		Integer obj1 = Integer.valueOf("3443");
		System.out.println(obj1);
		
		//Convert string to Boolean
		Boolean obj2 = Boolean.valueOf("true");
		System.out.println(obj2);
		
		//UnBoxing concept
		
		 int s = obj1.intValue();
		 System.out.println(s);
		 String s1 = obj2.toString();
		 System.out.println(s1);
		 
		 
		 //Parse method
		 
		 String s2 = "1000";
		 String s3="343.33f";
		 String s4 = "555.34";
		 System.out.println("Parse method outputs : ");
		 int i1 = Integer.parseInt(s2);
		 System.out.println(i1);
		 float f = Float.parseFloat(s3);
		 System.out.println(f);
		 double d = Double.parseDouble(s4);
		 System.out.println(d);
	}
}
