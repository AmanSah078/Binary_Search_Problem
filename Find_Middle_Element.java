class Find_Middle_Element {
	static int binaysearch(int[] arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		
		
		while(start<=end)
		{
			//find the middle element
			int mid=(start+end)/2; //It may cause integer overflow for very large values of low and high.
			
			int mid= start+(high-start)/2;
			
			//now let's find the our target element
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				return mid;
			}

		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		//so array should be sorted 
		int[] arr={-18,-12,0,2,3,4,15,16,18,22,45};
		int result=binaysearch(arr,18);
		System.out.println(result);
	}
}