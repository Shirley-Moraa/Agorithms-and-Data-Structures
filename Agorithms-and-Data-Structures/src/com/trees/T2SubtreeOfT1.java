package com.trees;
//You have two very large binary trees: T1, with millions of nodes, and T2, 
//with hun- dreds of nodes Create an algorithm to decide if T2 is a subtree of T1

// we can traverse T2 and find its equivalent value in T1, the moment a node value is not found, becomes false
public class T2SubtreeOfT1 {
	
	//create a boolean function, true if t2 subset of t1
	
//	public boolean subTree(TreeNode one, TreeNode two) {
//		if(one == null) {
//			return false;
//		}else {
//			if(two == null) {
//				return true;
//			}
//		}
//		
//		if(one.key ==  two.key) {
//			// call match function
//				if(matchTree(one,two)) {
//					return true;
//				}
//			}
//		return (subTree(one.left, two) || subTree(one.right,two));
//	
//		}
//	
//	public boolean matchTree(TreeNode r1,TreeNode r2) {
//		if(r2 == null && r1 == null) {
//			return true;
//		}
//		if(r1 == null || r2 == null) {
//			return false;
//		}
//		if(r1.data != r2.data) {
//			return false;
//		}
//		
//		return (matchTree(r1.left,r2.left) && matchTree(r1.right, r2.right));
//		
//		
//	}
//	
//	
	
	
 
}
