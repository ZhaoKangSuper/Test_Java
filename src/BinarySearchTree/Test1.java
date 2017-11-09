package BinarySearchTree;

import java.util.ArrayList;

class TreeNode {
    int val = 0;
    TreeNode left = null ;
    TreeNode right = null ;
 
    public TreeNode(int val) {
        this.val = val;
 
    }
}

public class Test1 {
	
	public Test1(){}
	
	TreeNode KthNode(TreeNode pRoot, int k)
	{
		if(k<=0||pRoot==null)    
			return null;
		ArrayList<TreeNode> arr=new ArrayList<TreeNode>();
		TreeNode test=new TreeNode(-1);
		if(arr.size()==0)  
			arr.add(test);     
		Inorder(pRoot,arr);
		if(k>arr.size()-1) 
			return null;
		return arr.get(k);
	}

	public void Inorder (TreeNode pRoot,ArrayList<TreeNode> arr)
	{
        if(pRoot==null) 
        	return;
        Inorder(pRoot.left,arr);
        arr.add(pRoot);
        Inorder(pRoot.right,arr);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 te = new Test1();
		
		TreeNode tn1 = new TreeNode(5);
		TreeNode tn2 = new TreeNode(3);
		TreeNode tn3 = new TreeNode(7);
		TreeNode tn4 = new TreeNode(2);
		TreeNode tn5 = new TreeNode(4);
		TreeNode tn6 = new TreeNode(6);
		TreeNode tn7 = new TreeNode(8);
		
		tn1.left = tn2;  
		tn1.right = tn3;  
		          
		tn2.left = tn4;  
		tn2.right = tn5;  
		          
		tn3.left = tn6;  
		tn3.right = tn7; 
		
		System.out.println(te.KthNode(tn1, 3).val);
		

	}

}
