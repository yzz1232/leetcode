package day01;

/**
 * 8.1
 * @author Administrator
 *
 * hello retur olleh
 */
public class ReverseString {
	
	public static String reverse(String s){
		
		String temp = "";
		char[] ss = s.toCharArray();
		/**
		for(int i=ss.length-1;i>=0;i-- ){
			temp = temp+ss[i];
		}
		*/
		char c ;
		for(int i=0;i<ss.length/2;i++){
			c = ss[i];
			ss[i] = ss[ss.length-1-i];
			ss[ss.length-1-i] = c;
		
		}
		
		return String.valueOf(ss);
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverse("hello223"));
	}
	
	
}
