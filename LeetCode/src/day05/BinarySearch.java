package day05;

public class BinarySearch {
	
	public static int BinarySearch(int[] nums,int value){
		int low = 0;
		int hi = nums.length-1;
		while(low<=hi){
			int mid = (low+hi)/2;
			if(nums[mid]>value){
				hi = mid-1;
			}else if(nums[mid]<value){
				low = mid+1;
			}else{
				return mid;
			}
		}
		
		return -1;
	}
	
	public static int BinarySearch2(int[] nums,int value,int low,int hi){
		if(low<=hi){
			int mid = low + (hi-low)/2;
			if(nums[mid]>value){
				return BinarySearch2(nums,value,low,mid-1);
			}else if(nums[mid]<value){
				return BinarySearch2(nums,value,mid+1,hi);
			}else{
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,5,6,7,8,9};
		System.out.println(BinarySearch2(nums,8,0,nums.length-1));
	}
	
}
