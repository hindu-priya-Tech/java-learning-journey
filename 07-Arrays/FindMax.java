import java.util.Arrays;

public class FindMax {

	public static void main(String[] args) {

		int[] arr = { 1,33,40,100,32, 50};
        int result=findMax(arr);
        System.out.println(result);
	}
	
	static int findMax(int[] arr)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		
		int maxval = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > maxval)
			{
				maxval=arr[i];
			}
		}
		return maxval;
	}

}	