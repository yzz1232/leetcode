package day03;

public class OnePlus {
	
	public static int[] onePlus(int[] nums){
		
		for(int i=nums.length-1;i>=0;i--){
			if(nums[i]==9){
				nums[i] = 0;
				continue;
			}else{
				nums[i] = nums[i]+1;
				return nums;
			}
		}
		int[] nums2 = new int[nums.length+1];
		nums2[0] = 1;
		return nums2;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,8,9};
		nums = onePlus(nums);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}
