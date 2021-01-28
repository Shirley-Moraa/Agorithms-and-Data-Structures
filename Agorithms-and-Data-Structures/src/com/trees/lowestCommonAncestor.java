package com.trees;

public class lowestCommonAncestor {
    Nod root;
    
    
    public static Nod lowestCommonAncestor(Nod root, Nod one, Nod two) {
    	
    	// find if the two nodes are not equal to null, if false return null
    	// if either is null, return the other
    	// then do inOrderTraversal
    
    	if(root == null) {
    		return null;
    	}
    	
    	if(root.key == one.key ||  root.key == two.key) {
    		return root;
    	}	
    	// traverse, the left subtree
    	Nod left = lowestCommonAncestor(root.left, one, two);
    	
    	// traverse the rigt subtree
    	Nod right = lowestCommonAncestor(root.right, one, two);
    	
    	if(left != null && right != null) {
    		return root;
    	}
    	if(left == null) {
    		return right;
    	}else {
    		return left;
    	}

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lowestCommonAncestor tree = new lowestCommonAncestor();
		
		tree.root =  new Nod(40);
        tree.root.left = new Nod(20);
        tree.root.right = new Nod(60);
        tree.root.left.left = new Nod(10);
        tree.root.left.right = new Nod(30);
        tree.root.right.left = new Nod(50);
        tree.root.right.right = new Nod(70);
        tree.root.right.right.left = new Nod(55);
        tree.root.left.left.left = new Nod(5);
        
        Nod root = tree.root;
    
        Nod one = tree.root.left.left.left;
        Nod two = tree.root.left.right;
        
        System.out.println("The Lowest common Ancestor for node 5 and 30 is: ");
        System.out.println(lowestCommonAncestor(root, one, two).key);
	}

}
class Nod{
	int key;
	
	Nod left;
	Nod right;
	
	// constructor
	public Nod(int key) {
		this.key = key;
	}
	
	
}
