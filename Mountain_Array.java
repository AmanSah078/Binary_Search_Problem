class Mountain_Array {
	//now first i am going to use the method
	static int mountainArray(int[] arr)
	{
		//whenever u r going to the comapare current element to the next element then u not need to use the start<=end-Wrong
		//So Right? start<end
	int start=0;
	int end=arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			//dude when ur array in the form in Increasing when
			if(arr[mid]<arr[mid+1])
			{
				start=mid+1;
			}
			//Dude when our Array is in the form in Decreasing when
			else {
			end=mid;
			}
		}
		return end; //or u can return end at the end both the element pointing to the same element na dude 
		
		//Now in the end ,start==end pointing to the same element 
	}
	public static void main(String[] args)
	{
		//int[] arr={0,1,0};
		//int[] arr= {0,2,1,0};
		int[] arr={1,2,3,5,6,4,3,2};
		int result=mountainArray(arr);
		System.out.println(result);
	
	}

}