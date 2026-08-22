import java.util.Scanner;
public class Find_Positive_and_Negative_Numbers {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num =scan.nextInt();
		if(num > 0)
		{
			
			System.out.println("POSITIVE");
		}else if(num < 0)
		{
			System.out.println("NEGATIVE");
		}else
		{
			System.out.println("ZERO");
		}
		
   }
}


    

