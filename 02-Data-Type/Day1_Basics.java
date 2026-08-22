import java.util.Scanner;

public class Day1_Basics {

public static void main(String[] args) {

       //get input from user using Scanner 

        Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 =scan.nextInt();
		System.out.println("Enter a number: ");
		int num2 =scan.nextInt();
	
		System.out.println("SUM : " + (num1 + num2) );
		System.out.println("DIFFERENCE : " +(num1 - num2));
		System.out.println("PRODUCT :" + num1 * num2);
		System.out.println("QUOTIENT :  " + num1 / num2);
		System.out.println("REMAINDER : " + num1 % num2);
		
		System.out.println("Enter the radius : ");
		int radius = scan.nextInt();
		System.out.println("Area of the circle  ");
		float area = (float) (Math.PI * (radius * radius));
		System.out.println(area);
    }
}
    

