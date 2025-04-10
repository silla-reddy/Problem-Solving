package com.ds.binaryTree;

public class TreeNode {
	public TreeNode left;
	public TreeNode right;
	int val;
	public TreeNode(int val) {
		this.val=val;
		this.left=this.right=null;
	}
	public TreeNode() {
		
	}
	public TreeNode(int val,TreeNode left,TreeNode right) {
		this.val=val;
		this.left=left;
		this.right=right;
	}
}
