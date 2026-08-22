import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		
		int[] arr= new int[3];
		int[] arr2= {1,2,3,4,5,};
		
		for(int i=0;i< arr.length;i++) {
			arr[i]=in.nextInt();
			System.out.println(arr[i]);
			
		}
		System.out.println(Arrays.toString(arr));
		
		// for string 
		
		String[] name= {"priya","hindu","varthini"};
		String[] fruit=new String[2];
		
		System.out.println(Arrays.toString(name));
		
		for(int i=0;i< fruit.length;i++) {
			fruit[i]=in.next();
			System.out.println(fruit[i]);	
		}
		
		System.out.println(Arrays.toString(fruit));
		
		// initialize array
		
		int[] marks;
		
		//declaration of array
		
		marks=new int[6];
		
		// for each loop

		for(int efor : arr) {
			System.out.println(efor + " "); // here efor represents the element of the array
		}

    }  
}  