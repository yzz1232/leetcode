package day04;

public class isPowerOfThree {
	
	public static  boolean isPowerOfThree(int num){
		/**
		while(n>0 && n%3==0){
			n = n/3;
		}
		
		return n==1;
		*/
		
		/**
		if(n>0){
			if(1162261467%n==0){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
		*/
		
		 
	        int i=0;
	        while(num!=0){
	            num = num&1;
	            num = num>>1;
	            i++;
	        }
	        if(i!=1 && i/2>0){
	            return true;
	        }else{
	            return false;
	        }
		
	}
	
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(19685));
	}
}
