class FirstOccurance_LastOccurance  {
	//I have to take two method 
	
	
	//first method u have to write the logic of the mid
	static int searchelement(int[] arr, int target)
	{
		int start=0;
		int end=arr.length-1;
		int ans = -1;
		while(start<=end)
		{
		int mid=start+(end-start)/2;
		
		if(target>arr[mid])
		{
			start= mid+1;
		}
		else if(target<arr[mid])
		{
			end= mid-1;
		}
		else {
//			return arr[mid];
//			int ans=0;

			
			  ans = mid;
			//Move left for the 1st occurance
			  end=mid-1;
			
			
		}
		}
		
		return ans;
	}
	
	//This method is for the last occurance
	    // Last Occurrence
    static int lastOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {

                // Store answer
                ans = mid;

                // Move right for last occurrence
                start = mid + 1;
            }
        }
		return ans;
	}
	public static void main(String[] args)
	{
		int[] arr={5,7,7,7,7,8,8,10};
		System.out.println(searchelement(arr,8));
		System.out.println(lastOccurrence(arr,8));
		
	}
}