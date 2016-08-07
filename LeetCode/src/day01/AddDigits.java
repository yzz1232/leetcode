package day01;

/**
 * 8.2  38 = 3+8 = 11 = 1+1= 2  return onr digit   0110  0110  0110  
 * @author Administrator
 *
 */
public class AddDigits {
	
	public static int addDigits(int a){
		/**	
		while(a/10>0){ //求商
			a = a/10 + a%10;  //548
		}
		
		return a;
		*/
		
		return (a-1)%9+1;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(addDigits(218));  
	}
	
}
