package day01;


public class SameTree {
	
	class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		public TreeNode(int value){
			this.value = value;
		}
	}
	
	public boolean isSameTree(TreeNode p,TreeNode q){
		if(p==null && q!=null){
			return false;
		}
		if(p!=null && q==null){
			return false;
		}
		
		if(p==null && q==null){
			return true;
		}
		
		if(p.value == q.value){
			return true;
		}
		
		if(isSameTree(p.left,q.left) && isSameTree(p.right,q.right)){
			return true;
		}
		
		return false;
	}
	
}	
