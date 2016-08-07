package day03;

import java.util.HashMap;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums){
		if(nums.length==0){
            return false;
        }
       
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int i:nums){
    	  if(map.containsKey(i)){
    		  return true;
    	  }
    	  map.put(i, 1);
      }
        return false;
	}
}
