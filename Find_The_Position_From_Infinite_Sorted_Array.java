class Find_The_Position_From_Infinite_Sorted_Array {
	
	//Now this is our 2nd method
	static int ansmeanstofindtherange(int[] arr, int target)
	{
	int start=0;
		//not allow arr.length-1
	int end=1;
		
		while(target>arr[end])
		{
			int temp=end+1;
			//we will count the end(length) froom their position
		    end=end-(start-end+1)*2;
			//now to keep the temp into the org start
			start=temp;
		}
		return binarysearch(arr,10,start0,end);
	}
	
	
	//This is my 1st method
	static int binarysearch(int[] arr,int target int start, int end)
	{
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(target<arr[mid])
			{
				end= mid-1;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else {
				return mid;
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr={3,5,7,9,10,90,100130,140,150,170};
		int ans=ansmeanstofindtherange(arr,10);
		System.out.println(ans);
	}
}