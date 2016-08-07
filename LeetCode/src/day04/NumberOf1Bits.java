package day04;

public class NumberOf1Bits {
	
	public static int hammingWeight(int n) {
		
		 if(n==0){
			 return 0;
		 }			 
         int i=0;
         while(n!=0){
        	 n = n&(n-1);
        	 i++;
         }
         return i;
	}
	
	//  2147483648 (10000000000000000000000000000000)
	public static void main(String[] args) {
		System.out.println(hammingWeight(2147483647));
	}
	
}
