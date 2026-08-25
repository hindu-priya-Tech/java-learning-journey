import java.util.ArrayList;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {

		//array has a fixed size because we put the size for that
		//when we don't know how much size we want that time we ask data structure to handle that size problem that time it give array list
		// this topic is similar to vectors in c++
		//syntax
		ArrayList<Integer> list = new ArrayList<Integer>();//array list is basically class,array list<>()this is a constructor 10= initial capacity
		// ArrayList<ArraysList<Integer>> list= new ArraysList<>();
		Scanner scan=new Scanner(System.in);
		
		list.add(12);
		list.add(120);
		list.add(125);
		list.add(130);
		list.add(126);
		list.add(140);
		list.add(1212);
		list.add(1240);
		list.add(1250);
		list.add(121);

		System.out.println(list);
		
       list.set(1, 23);// its change the 1 index value as 23
       list.remove(2);//its remove 2nd index 125
		
		System.out.println(list.contains(1250));// true
		System.out.println(list);
		
		
		// input
		
		for(int i=0;i<5;i++)
		{
			list.add(scan.nextInt());
		}

        // another way to print
		
		for(int i=0;i<5;i++)
		{
			System.out.println(list.get(i));//pass index here
		}
		System.out.println(list);

		//initialization
		
		// for(int i=0;i<3;i++)   // without this it give a error msg
		// {
		// 	list.add(new ArrayList<>());
		// }
		
//		// add elements
//		
		// for(int i=0;i<3;i++)
		// {
		// 	for(int j=0;j<3;j++)
		// 	{
		// 		list.get(i).add(scan.nextInt());
		// 	}
		// }
		// System.out.println(list);//to find max item in array
	
		
	}

}
 
    
