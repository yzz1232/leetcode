package day01;

/**
 * 求最大深度
 * @author Administrator
 *
 */
public class MaximumDepth {
	
	class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		public TreeNode(int value){
			this.value = value;
		}
	}
	
	int max = 0;
	
	public int maxDept(TreeNode node){
		
		if(node==null){
			return 0;
		}
		maxDept(node,1);
		return max;
	}
	
	public void maxDept(TreeNode node,int dept){
		if(dept>max){
			max = dept;
		}
		
		if(node.right!=null){
			maxDept(node.right,dept+1);
		}
		if(node.left!=null){
			maxDept(node.left,dept+1);
		}
		
		
	}
	
}
