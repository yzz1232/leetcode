package day04;

public class PowerOfFour {
	
	public static boolean isPowerOfFour(int num){
		int i=0;
		int j=0;
        while(num!=0){
        	j = (num&1)+j;
            num = num>>1;
            i++;
        }
        
        if(j>1){
        	return false;
        }
        
        if(i!=1 && i%2>0){
            return true;
        }else{
            return false;
        }
	}
	
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(32));
	}
	
}
