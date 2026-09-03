public class SplitArray {

	public static void main(String[] args) {

		int[] arr= {7,2,5,10,8};
		int m=2;
		System.out.println(splitArray(arr,m));
		
	}
	
	static int splitArray(int[] nums, int m)
	{
		int start=0;
		int end = 0;
		
		for(int i = 0; i < nums.length; i++) {
			start = Math.max(start,  nums[i]);// i  the end of the loop this will contain the max item for the array
			end += nums[i];		
		}
		
		// binary search
		
		while(start < end)
		{
			//try for the middle as potential answer
			int mid = start + (end - start) / 2;
			
			// calculate how many pieces you can divide this in with this max sum
			int sum = 0;
			int pieces = 1;
			for(int num: nums)
			{
				if(sum + num > mid)
				{
					// you can not add this in this subarray , make new one
					// say you add this num in new subarry, then sum = num
					sum = num;
					pieces++;
				}else {
					sum += num;
				}
			}
			
			if(pieces > m)
			{
				start = mid + 1;
			}else {
				end = mid;
			}
		}
		return end; // here start == end
	}

}
