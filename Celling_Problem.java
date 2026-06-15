package Dsa_Once_Again.Binary_Search_Problems;

public class Celling_Problem {

    static int findthecelligelement(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            //now i am going to find the mid
            int mid=start+(end-start)/2;

            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else {
              return arr[mid];
              //or u can return the mid only when u want to  get the index number
            }
        }

      //  return arr[start];
        //but u want only index number so we can use this one
        return start;
    }
    public static void main(String[] args)
    {
        int[] arr={2,3,5,14,16,18};
       int result= findthecelligelement(arr,13);
       System.out.println(result);
    }
}
