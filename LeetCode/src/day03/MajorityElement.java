package day03;

import java.util.HashMap;
import java.util.Map;

/**
 * 寻找一个数组 中出现次数大于n/2的
 * @author Administrator
 *
 */
public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
		
        int number = (int)Math.floor(nums.length/2+1);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<=nums.length-1;i++){
        	if(map.get(nums[i])==null){
        		map.put(nums[i], 1);
        	}else{
        		map.put(nums[i],map.get(nums[i])+1);
        	}
        }
        
        for(Integer key:map.keySet()){
        	if(map.get(key) >= number){
        		return key;
        	}
        }
        
        return -1;
    }
	
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(majorityElement(nums));
	}
	
}
