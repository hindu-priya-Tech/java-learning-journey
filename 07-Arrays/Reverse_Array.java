import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {

		int[] arr = { 1,33,40,100,32, 50,12};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void reverse(int[] arr)
	{
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end)
		{
			// swap
			swap(arr,start,end);
			start ++;
			end--;
		}
	}
	
	static void swap(int[] arr, int index1 , int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}

