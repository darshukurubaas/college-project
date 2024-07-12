package exp11;

public class unchecked {


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
