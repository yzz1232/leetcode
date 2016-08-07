package day07;

import java.util.Arrays;

public class TwoSum {
	
	 public static int[] twoSum(int[] nums, int target) {
		 int[] nums2 = new int[nums.length];
		 System.arraycopy(nums, 0, nums2, 0, nums.length);
		 Arrays.sort(nums);
		 int[] result = new int[2];
		 int left = 0;
		 int right = nums.length-1;
		 
		 int t1 = 0;
		 int t2 = 0;
		 while(left<=right){
			 if(nums[left]+nums[right]>target){
				 right--;
			 }else if(nums[left]+nums[right]<target){
				 left++;
			 }else{
				t1 = nums[left];
				t2 = nums[right];
				left=right+1;
			 }
		 }
		 
		 int index = 0;
		 for(int i=0;i<nums2.length;i++){
			if(nums2[i] == t1 || nums2[i] == t2){
				result[index++] = i;
			} 
		 }
		 return result;
	 }
	 
	 public static void main(String[] args) {
		 int[] nums = new int[]{3,2,4};
		System.out.println(twoSum(nums,6));
	}
}


/**
Map<Integer,Integer> map = new HashMap<Integer,Integer>();
int[] result = new int[2];
for(int i=0;i<nums.length;i++){
	if(map.containsKey(target-nums[i])){
		result[0] = i;
		result[1] = map.get(target-nums[i]);
	}else{
		map.put(nums[i], i);
	}
}

return result;
*/