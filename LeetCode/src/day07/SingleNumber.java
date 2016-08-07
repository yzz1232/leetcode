package day07;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.get(nums[i])==null){
				map.put(nums[i], 1);
			}else{
				map.put(nums[i],map.get(nums[i])+1);
			}
		}
		
		int value = 0;
		
		for(Integer key:map.keySet()){
			if(map.get(key)==1){
				value = key;
			}
		}
		return value;
    }
	
	
/**
 * 
 * @param nums
 * @return
 */
	public int singleNumber2(int[] nums) {
		int result = 0;
		for(int i=0;i<nums.length;i++){
			result =result^nums[i]; 
		}
		
		return result;
    }
}
