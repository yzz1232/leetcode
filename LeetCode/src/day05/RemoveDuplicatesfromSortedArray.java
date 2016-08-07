package day05;


public class RemoveDuplicatesfromSortedArray {
	public static int Soution(int[] nums){
		if(nums.length==1){
			return nums.length;
		}
		int pos = 0;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]!=nums[i+1]){
				nums[pos++] = nums[i];
			}
			if(i==nums.length-2){
				nums[pos++] = nums[nums.length-1];
			}
			
		}
		int temp = pos;
		for(;pos<nums.length;pos++){
			nums[pos] = 0;
		}
		return temp;
	} 
	
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(Soution(nums));
	}
}
