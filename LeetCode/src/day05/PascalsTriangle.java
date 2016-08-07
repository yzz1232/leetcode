package day05;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	 public static List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> pList = new ArrayList<List<Integer>>();
		 for(int i=1;i<=numRows;i++){
			 List<Integer> list = new ArrayList<Integer>(i);
			 list.add(1);
			 for(int j=1;j<i-1;j++){
				 list.add(pList.get(i-2).get(j)+pList.get(i-2).get(j-1));
			 }
			 if(i!=1){
				 list.add(1); 
			 }
			 pList.add(list);
		 }
		 return pList;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(generate(5));
		
	}
}
