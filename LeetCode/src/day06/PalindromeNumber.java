package day06;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int x){
		if(x==0){
			return true;
		}else if(x<0){
			return false;
		}
		int temp = 0;
		int y = x;
		while(x!=0){
			 temp = 10*temp + x%10;
			 x=x/10;
		}
		if(temp!=y){
			return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(isPalindrome(1211));
	}
}
