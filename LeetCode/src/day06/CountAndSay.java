package day06;

public class CountAndSay {
	public static String countAndSay(int n) {
		String s = "1";
		if(n==1){
			return s;
		}
		
		for(int i=2;i<=n;i++){
			int pos = 0;
			String temp = "";
			if(s.length()==1){
				s = "11";
				continue;
			}
			for(int j=0;j<s.length();j++){
				if(j!=s.length()-1){
					if(s.charAt(j)==s.charAt(j+1)){
						pos++;
					}else{
						pos++;
						temp=temp+pos+s.charAt(j);
						pos=0;
					}
				}else{
						pos++;
						temp=temp+pos+s.charAt(j);
						pos = 0;
					}
				}
			s = temp;
			temp = "";
			}
		return s;
		}
	
	
	public static void main(String[] args) {
		System.out.println(countAndSay(5));
	}
}
