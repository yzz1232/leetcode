package day03;

/**
 * 不允许使用 + - 求和
 * @author Administrator
 *
 */
public class SumOfTwoInteger {
	
	public static int sum(int a,int b){
		while(b!=0){
			int c = a^b;
			b = (a&b)<<1;
			a = c;
		}
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1,10));
	}
	
}
