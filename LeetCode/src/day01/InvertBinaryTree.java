package day01;



public class InvertBinaryTree {
	
	class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		public TreeNode(int value){
			this.value = value;
		}
	}
	
	public TreeNode invertTree(TreeNode root){
		TreeNode temp = null;
	        
	        while(root.left!=null && root.right==null){
	            root.right = root.left;
	            root.left = null;
	            invertTree(root.right);
	        }
	        
	        while(root.left==null && root.right!=null){
	        	 root.left = root.right;
	             root.right = null;
	             invertTree(root.left);
	        }
	        
	        while(root.left!=null && root.right!=null){
	            temp = root.left;
	            root.left = root.right;
	            root.right = temp;
	            invertTree(root.right);
	            invertTree(root.left);
	        }
	        
	        return root;
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
