class Celling_Element {
	static int findthecellingelement(int[] arr, int target)
		
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
	//mid find kro
			int mid=start+(end-start)/2;                            
			
			//now apply condition
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else {
				return mid;
			}
		}
		if(target > arr[arr.length-1])
{
    return -1;
}
		return arr[start];

	}
	public static void main(String[] args)
	{
		int[] arr={2,3,5,14,16,18};
		int result=findthecellingelement(arr,target);
		System.out.println(result);
	}
}