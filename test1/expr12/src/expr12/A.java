package expr12;

public class A {
	interface printable
	{
		void print();
	}
	interface showable
	{
		void show();
	}
static class A7 implements printable,showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
		public static void main(String[] args) {
			A7 obj=new A7();
			obj.print();
			obj.show();
					
		}
		

	}

}
