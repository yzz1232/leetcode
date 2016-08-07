package day04;

public class IsPowerOfTwo {
	
	public static boolean Solution(int n){
		int curry = 0;
		while(n>0){
			curry =  (n&1) + curry;
			n = n>>1;
		}
		return curry==1;
	}
	
	public static void main(String[] args) {
		System.out.println(Solution(7));
		System.out.println(3&1+1);
	}
}
