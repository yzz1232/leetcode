package day07;

public class ReverseInteger {
	 public static int reverse(int x) {
		 
		 long total = 0;
		 int falg = 0;
		 if(x<0){
			 x = -x;
			 falg = -1;
		 }
		 
		 while(x!=0){
			total = total*10+x%10;
			if(total>Integer.MAX_VALUE || total<Integer.MIN_VALUE){
				return 0;
			}
			x=x/10;
		 }
		 
		 if(falg == -1){
			 total=-total;
		 }
		 return (int)total;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
}
