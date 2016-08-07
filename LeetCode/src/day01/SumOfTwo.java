package day01;

/**
 * 先求和 再求进位
 * @author Administrator
 *
 */
public class SumOfTwo {
	
	public static int sum(int a,int b){
		
		 while(b!=0){
	           int c = a^b;   //求不进位
	           b = (a&b)<<1;  //求进位
	           a = c;
	           sum(a,b);
	       } 
	       
	       return a;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(1,2)); // 1111 0101  相同的为 0 不同为1
		
	}
	
}
