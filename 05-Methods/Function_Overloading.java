import java.util.Arrays;

public class Function_Overloading {

	public static void main(String[] args) {

		// two or more function have the same name wih differnt return type and arguments
		// compile time it decide which function will run
		fun(10);
		fun("Java Programming Language");
		int result=fun(10,33,40);
		System.out.println(result);
		int R=fun(12,20);
		System.out.println(R);


		
	}
	static int fun(int a , int b) {
		return a+ b;
	}
	static int fun(int a , int b , int c) {
		return a+ b +c;
	}
	static void fun(int a)
	{
		System.out.println(a);
	}
	static void fun(String name)
	{
		System.out.println("Welcome to" + name);
	}


}
