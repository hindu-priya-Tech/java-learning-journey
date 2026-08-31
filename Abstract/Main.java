package Abstract;

//System.out.println();

public class Main {

	public static void main(String[] args) {
		Son son=new Son(30);
		son.career();
		System.out.println(son.age);
		
		son.normal();
		
		Daughter daughter=new Daughter(25);
		daughter.career();
		System.out.println(daughter.age);
		
		//we can't create object for abstract class
		
//		Parent obj=new Parent();//it give error 
		
		Parent.greeting();//we didn't want to any object to execute static method
	}

}

