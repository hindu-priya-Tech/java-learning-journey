public class SerachInRange {

	public static void main(String[] args) {
		
		int[] nums= {12,34,54,7,20,30,7,6};
		int target=5467;
		
		int ans=search(nums,target,1,4);
		System.out.println(ans);

	}
	
	// search elements from the range index 1 to 5
	
	static int  search(int[] arr,int target , int start,int end)
	{
		if(arr.length==0)
		{
			return -1;
		}
		
		for(int index=start;index <= end;index ++)
		{
			int element=arr[index];
			if(element==target)
			{
				return index;
			}
		}
		return -1;
	}

}
