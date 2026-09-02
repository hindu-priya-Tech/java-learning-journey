import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		
		int[][] arr= {
				
				{23,34,7},
				{98,17,60,32},
				{70,35,16,3},
				{12,48},
				{65,30,15}
				
		};
		int target=30;
		int[] ans=search(arr,target);//format of return value {row,col}
		System.out.println(Arrays.toString(ans));
		System.out.println(max(arr));

		
	}
	
	static int[] search(int[][] arr, int target)
	{
		for(int row=0;row < arr.length; row++)
		{
			for(int col=0;col < arr[row].length;col++)
			{
				if(arr[row][col] == target)
				{
					return new int[] {row,col};
				}
			}
		}
		
		return new int[]{-1,-1};
		
	}
	
	//maximum of 2D array
	
	static int max(int[][] arr)
	{
		int max=arr[0][0];//or using Integer.MIN_VALUE;
		for(int row=0;row < arr.length; row++)
		{
			for(int col=0;col < arr[row].length;col++)
			{
				if(arr[row][col] > max)
				{
					max=arr[row][col];
				}
			}
		}
		
		return max;
		
	}
	
	//using enhanced for loop 
	
	
//	for(int[] a: arr)
//	{
//		for(int aa: a)
//		{
//			if(aa > max)
//			{
//				max=aa;
//			}
//		}
//	}

}
