package day04;

public class ClimbingStairs {
	
	public static int solution(int n){
		if(n==1 || n==2){
	           return n;
	       }
	        
	       int s1 =1;
	       int s2=2;
	       int s3 = 0;
	       for(int i=3;i<=n;i++){
	           s3 = s1+s2;
	           s1= s2;
	           s2=s3;
	       }
	       return s3;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(3));
	}
}
