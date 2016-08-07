package day06;

public class FactorialTrailingZeroes {
	public static int trailingZeroes(int n) {
		
	       int i=0;
	       while(n!=0){
	    	   i = n/5+i;
	    	   n=n/5;
	       }
	       return i;
    }
	public static void main(String[] args) {
		System.out.println(trailingZeroes(1808548329)); //452137076
	}
}
