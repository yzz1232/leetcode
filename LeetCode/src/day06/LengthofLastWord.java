package day06;

public class LengthofLastWord {
	 public int lengthOfLastWord(String s) {
	        String[] ss = s.split(" ");
	        if(ss.length==0){
	            return 0;
	        }else{
	            return ss[ss.length-1].length();
	        }
	        
	    }
}
