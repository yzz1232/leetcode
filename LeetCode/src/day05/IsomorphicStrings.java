package day05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *  存坐标  存值  存次数
 * @author Administrator
 *
 */
public class IsomorphicStrings {
	public static boolean isIsomorphic(String a,String b){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();
		
		if(a.length()!=b.length()){
			return false;
		}
		
		
		for(int i=0;i<a.length();i++){
			if(map.get(aa[i])!=null && map2.get(bb[i])==null){
				return false;
			}else if(map.get(aa[i])==null && map2.get(bb[i])!=null){
				return false;
			}else if(map.get(aa[i])==null && map2.get(bb[i])==null){
				map.put(aa[i], i);
				map2.put(bb[i],i);
			}else{
				if(map.get(aa[i])!=map2.get(bb[i])){
					return false;
				}
			}
		}
		
		/**
		 if(map.get(aa[i])==null && ){
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(a.charAt(i), list);
			}else{
				List<Integer> list = new ArrayList<Integer>();
				list = map.get(a.charAt(i));
				list.add(i);
				map.put(a.charAt(i),list);
			}
		 * 
		char[] s = b.toCharArray();
		
		for(List<Integer> value:map.values()){
			if(value.size()>1){
				char c = s[value.get(0)];
				for(int i=1;i<value.size();i++){
					if(c!=s[value.get(i)]){
						return false;
					}
				}
			}
		}
		*/
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isIsomorphic("aba","baa"));
	}
}
