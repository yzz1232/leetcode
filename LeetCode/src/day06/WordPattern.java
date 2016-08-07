package day06;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        Map<String,Integer> map2 = new HashMap<String,Integer>();
        
        if(pattern.length()!=str.split(" ").length)
            return false;
            
        for(int i=0;i<pattern.length();i++){
            if(map.get(pattern.charAt(i))!=null && map2.get(str.split(" ")[i])==null){
                return false;
            }else if(map.get(pattern.charAt(i))==null && map2.get(str.split(" ")[i])!=null){
                return false;
            }else if(map.get(pattern.charAt(i))==null && map2.get(str.split(" ")[i])==null){
                map.put(pattern.charAt(i),i);
                map2.put(str.split(" ")[i], i);
            }else{
            	if(map.get(pattern.charAt(i))!=map2.get(str.split(" ")[i])){
            		return false;
            	}
            }
        }
        return true;
    }
	
	
	public static void main(String[] args) {
		System.out.println(wordPattern("abba","dog cat cat dog"));
	}
}
