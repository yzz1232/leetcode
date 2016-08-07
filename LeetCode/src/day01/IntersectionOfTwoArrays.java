package day01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
	
	public static int[] intersection(int[] nums,int[] nums2){
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int num:nums){
			set.add(num);
		}
		
		for(int i=0;i<nums2.length;i++){
			if(set.contains(nums2[i])){
				set2.add(nums2[i]);
			}
		}
		
		int[] newNums = new int[set2.size()];
		int z = 0;
		for(int num:set2){
			newNums[z++] = num;
		}
		
		for(int i=0;i<newNums.length;i++){
			System.out.println(newNums[i]);
		}
		return newNums;
	}
	
	public static void main(String[] args) {
		int[] nums = {1};
		int[] nums2 = {1};
		intersection(nums,nums2);
	}
}
