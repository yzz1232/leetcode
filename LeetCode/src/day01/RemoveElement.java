package day01;

public class RemoveElement {
	
	public static int removeElement(int[] nums,int value){
		
		int pos = 0;
		for(int a:nums){
			if(a!=value){
				nums[pos++] = a;
			}
		}
		
		return pos;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{3,2,2,3};
		System.out.println(removeElement(nums,3));
	}
}
