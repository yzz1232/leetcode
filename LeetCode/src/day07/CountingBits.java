package day07;

/**
 *8.6
 * @author Administrator
 *
 */
public class CountingBits {
	 public static int[] countBits(int num) {
		 int[] nums = new int[num+1];
		 for(int i=0;i<=num;i++){
			 int temp = i;
			 int total = 0;
			 while(temp!=0){
				 total= total+(temp&1);
				 temp=temp>>1;
			 }
			 nums[i] = total;
		 }
		 return nums;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(countBits(4));
	}
}
