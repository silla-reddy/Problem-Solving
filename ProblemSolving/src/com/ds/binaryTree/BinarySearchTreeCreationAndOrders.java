package com.ds.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeCreationAndOrders {
	static int index=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {8,5,1,7,11,10,12};
		TreeNode output=createBstFromPreorderArray(arr, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println("PreOrder");
		preorderTraversalOfTree(output);
		System.out.println("\n"+"Post order");
		postOrderTraversalOfTree(output);
		System.out.println("\n"+"In order");
		inOrderTraversal(output);
		System.out.println("\n"+"Level order");
		levelOrderTraversal(output);
		
	}
	
	
	public static TreeNode createBstFromPreorderArray(int arr[],int min, int max) {
		if(index>=arr.length) {
			return null;
		}
		int element=arr[index];
		TreeNode node=null;
		if(element>min & element<max) {
			index++;
			node=new TreeNode(element);
			node.left=createBstFromPreorderArray(arr, min, element);
			node.right=createBstFromPreorderArray(arr,element,max);
		}
		
		return node;
	}
	
	public static void preorderTraversalOfTree(TreeNode root) {
		if(root!=null) {
			System.out.print(root.val+"-");
			preorderTraversalOfTree(root.left);
			preorderTraversalOfTree(root.right);
		}
	}
	
	public static void postOrderTraversalOfTree(TreeNode root) {
		if(root==null)
			return;
		postOrderTraversalOfTree(root.left);
		postOrderTraversalOfTree(root.right);
		System.out.print(root.val+"-");
	}
	
	public static void inOrderTraversal(TreeNode node) {
		if(node==null)
			return;
		inOrderTraversal(node.left);
		System.out.print(node.val+"-");
		inOrderTraversal(node.right);
	}
	
	public static void levelOrderTraversal(TreeNode node) {
		if(node==null)
			return;
		
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(node);
		while(!queue.isEmpty()) {
			TreeNode pollNode=queue.poll();
			System.out.print(pollNode.val+"-");
			if(pollNode.left!=null) {
				queue.add(pollNode.left);
			}
			if(pollNode.right!=null) {
				queue.add(pollNode.right);
			}
		}
	}

}
