import java.util.Arrays;

public class Variable_Length_argument {

	public static void main(String[] args) {

		fun(10,20,30,40,50,100);
		fun();
		multiple(10,20,"hindu","priya");
		demo(1,2,4);
		demo("hindu","priya");
	}
	
	static void demo(int ...v)
	{
		System.out.println(Arrays.toString(v));

	}
	
	static void demo(String ...v)
	{
		System.out.println(Arrays.toString(v));

	}
	
	static void multiple(int a, int b, String ...v)
	{
		
	}
	
	static void fun(int ...v) /// stores collection ofvalues
	{
		System.out.println(Arrays.toString(v));
	}

}
