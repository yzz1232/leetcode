package day03;

import java.util.HashSet;
import java.util.Set;

/**
 * 19 1+81 = 82 64+4 = 68 36+64=100 
 * @author Administrator
 *
 */
public class HappyNumber {
	
	public boolean isHappy(int num){
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(num!=1){
			int sum = 0;
			while(num!=0){
				sum = sum + num%10*num%10;
				num = num/10;
			}
			num = sum;
			if(set.contains(num)){
				return false;
			}else{
				set.add(num);
			}
		}
		return true;
	}
	
	
}
