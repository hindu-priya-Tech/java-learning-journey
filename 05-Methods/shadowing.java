public class shadowing {
  static int x=100;
  
	public static void main(String[] args) {
        // scope will begin when value is initialized      
		System.out.println(x);//100
		int x=10;
		System.out.println(x);//10
        main();
	}
	static void main()
	{
		System.out.println(x);//10
	}

}
