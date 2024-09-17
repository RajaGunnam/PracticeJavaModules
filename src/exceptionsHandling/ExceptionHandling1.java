package exceptionsHandling;

public class ExceptionHandling1 {

	static int a = 10, b=0,  c;
	public static void dev() {
		try {
		c=a/b;
		}
		catch(ArithmeticException e){
			//int b=10;
			c=a/b;
		}
		System.out.println(c);
	}
	
	public static void main(String args[]) {
		dev();
	}
}
