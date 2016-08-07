package day07;

public class FirstBadVersion {
	public int firstBadVersion(int n) {
		if(n==1){
            return 1;
        }
        
         int low = 1;
        int hi = n;
        int mid = 0;
        while(low<=hi){
        	mid = low+ (hi-low)/2;
        	if(isBadVersion(mid)==true){
        		if(isBadVersion(mid-1)==false){
        			return mid;
        		}else{
        			hi = mid-1;
        		}
        	}else if(isBadVersion(mid)==false){
        		low = mid+1;
        	}
        }
        return mid;
    }
}
