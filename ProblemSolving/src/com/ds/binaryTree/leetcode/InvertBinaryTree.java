package com.ds.binaryTree.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.binaryTree.BinarySearchTreeCreationAndOrders;
import com.ds.binaryTree.TreeNode;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,1,3,7,6,9};
		TreeNode node=BinarySearchTreeCreationAndOrders.createBstFromPreorderArray(arr, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		TreeNode invertTree=invertBinaryTree(node);
		BinarySearchTreeCreationAndOrders.preorderTraversalOfTree(invertTree);
	}
	
	public static TreeNode invertBinaryTree(TreeNode node) {
		if(node ==null)
			return null;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(node);
		while(!queue.isEmpty()) {
			TreeNode exitNode=queue.poll();
			 // Swap left and right
			TreeNode temp=exitNode.left;
			exitNode.left=exitNode.right;
			exitNode.right=temp;
			// Add children to queue only if not null
			if(exitNode.left!=null)
			queue.add(exitNode.left);
			if(exitNode.right!=null)
			queue.add(exitNode.right);
			
			
			 
		}
		return node;
		
	}
	
	
	

}
