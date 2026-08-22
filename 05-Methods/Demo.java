public class Demo {
	public static void main(String[] args) {

	  int  sum_ans = sum();
	  System.out.println(sum());
	  String  sub = submission();
	  System.out.println(sub);
	  int  sum2 = sum2(10,10);
	  System.out.println(sum2);
	  String  sub2 = submission2("finish");
	  System.out.println(sub2);
      greet();
		

	}
	
	static String submission()
	{
		return "The project is finish";
	}
	
	static String submission2(String name )
	{
		return "The project is " + name;
	}
	
	
	static int sum()
	{
		return 2+5;
	}
	
	static int sum2(int a, int b)
	{
		return a+b;
	}
	
	
	static void greet()
	{
		System.out.println("Good morning");
	}

}

