package day05;



public class BullsandCows {
	public static String getHint(String secret, String guess){
		int countA = 0;
		int countB = 0;
		
		int[] count=new int[10];
		for(int i=0;i<secret.length();i++){
			if(secret.charAt(i)==guess.charAt(i)){
				countA++;
			}else{
				count[secret.charAt(i)-'0']++;
				if(count[secret.charAt(i)-'0']<=0){
					countB++;
				}
				count[guess.charAt(i)-'0']--;
				if(count[guess.charAt(i)-'0']>=0){
					countB++;
				}
			}
		}
		
		return String.valueOf(countA)+"A"+String.valueOf(countB)+"B";
	}
	
	public static void main(String[] args) {
		System.out.println(getHint("1234","0111"));
	}
}
