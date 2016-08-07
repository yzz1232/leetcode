package day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays2 {
	
	public int[] solution(int[] nums1,int[] nums2){
		  Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i:nums1){
	            if(map.get(i)==null){
	                map.put(i,1);
	            }else{
	                map.put(i,map.get(i)+1);
	            }
	        }
	        
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i:nums2){
	            if(map.containsKey(i) && map.get(i)>0){
	                list.add(i);
	                map.put(i,map.get(i)-1);
	            }
	        }
	        
	        int[] newNums = new int[list.size()];
	        for(int i=0;i<list.size();i++){
	        	newNums[i] = list.get(i);
	        }
	
			return newNums;
	}
	
}
