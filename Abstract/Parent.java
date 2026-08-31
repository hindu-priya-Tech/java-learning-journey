package Abstract;

abstract public class Parent {
	
	static int age;
	
	final int value;//we can create final variable.
	
	public Parent(int age)
	{
		this.age=age;
		this.value=100;
	}
	
	// we can't create abstract constructor 
	
//	abstract Parent()
//	{
//		
//	}
//	it give error
	
	
	//we can create static method inside this
	
	static void greeting()
	{
		System.out.println("good morning");
	}
	
	void normal()
	{
		System.out.println("I am normal method");
	}
	
	abstract void career();
	abstract void partner();

}
