import java.util.Scanner;

public class Fibonacci_Num {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scan.nextInt();
		int a=0;
		int b=1;
		int count=2;
		
		while(count<=n)
		{
			int temb=b;
			b=a+b;
			a=temb;
			count++;
		}
		System.out.println("Fibonacci number of "+n+" is= "+b);//Example:6=8 9=34
		
	}

}
