package uncheacked;

public class unchecked2 {
	public static void main(String[] args) {
		try
		{
			int x = 0; int y
			= 10; int z = y / x; 
			System.out.println(z); 
			} 
			catch(ArithmeticException e) 
			{ 
			System.out.println(e);
		}
		}

	
}
