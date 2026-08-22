

public class Find_Max_In_Range {
    
    public static void main(String[] args) {

      int[] arr = { 1,33,40,100,32, 50}; 
      int result = findMaxRange(arr,1,4);
      System.out.println(result);

    }
    
    static int findMaxRange(int[] arr , int start , int end)
	{
		
		if(end > start)
		{
			return -1;
		}
		
		if(arr == null)
		{
			return -1;
		}
		
		int maxval = arr[start];
		for(int i = start; i < end; i++)
		{
			if(arr[i] > maxval)
			{
				maxval=arr[i];
			}
		}
		return maxval;
	}


}
