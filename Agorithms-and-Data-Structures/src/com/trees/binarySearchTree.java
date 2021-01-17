package com.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Given a binary search tree, design an algorithm which creates a linked list of all the nodes at each depth 
//(i e , if you have a tree with depth D, you’ll have D linked lists)

// similar question : print a binary tree, each level in one line

// do level order traversal using a queue<BFS>
public class binarySearchTree {
	Nodde root;
	NoddeInt root2;
	// create a queue to help in the level by level
	
     // function to print level by level 
	public static void printLevel(Nodde focusNode) {
		Queue<Nodde> q = new LinkedList<>();
		
		//represent the level
		int levelNodes  = 0;
		
		if(focusNode == null) {
			System.out.println("Empty tree");
			return;
		}
		
		// if not null, we add to q
		q.add(focusNode);
		// then we add null, to help show that the level is over
		
		// while the queue is not empty
		while(!q.isEmpty()) {
			// mark the level
			levelNodes = q.size();
			
			
			while(levelNodes > 0) {
				// we dequeue and print.  
				Nodde newNode = q.remove();
				System.out.print(newNode.key);
				
			  //add the left and right children	
				if(newNode.left != null) {
					q.add(newNode.left);
				}
				
				if(newNode.right != null) {
					q.add(newNode.right);
				}
				
				levelNodes --;
			}
			//then we have reached end of the level(add a new line),
			System.out.println();

		}
		
	}
	
	//function to create linked list of all nodes at each depth
	public static ArrayList<LinkedList<NoddeInt>> findLevelLinkedList(NoddeInt root2){
		// create a label variable
		int level  = 0;
		//create an ArryaList of linkedList nodes
		ArrayList<LinkedList<NoddeInt>>  result = new ArrayList<LinkedList<NoddeInt>>();
		
		//create a linkedList of nodes
		LinkedList<NoddeInt> list = new LinkedList<NoddeInt>();
		// we check if root is != null, add it to the linkedList
		list.add(root2);
		//add to the ArrayList of linkedList noddeInt
		result.add(level, list);
		
		
		// do level order traversal with modification of BFS(the function above can be BFS)
		while(true) {
			//we create a new LinkedList
			list = new LinkedList<NoddeInt>();
			
			
			for(int i =0 ; i < result.get(level).size() ; i++){
				NoddeInt n = (NoddeInt) result.get(level).get(i);
				
				if(n != null) {
					// check if it has right and left child, then add to the linkedList
					if(n.left != null) {
						list.add(n.left);
					}
					if(n.right != null) {
						list.add(n.right);
					}
				}
			}
			
			if(list.size() > 0) {
				result.add(level+1, list);
			}else {
				break;
			}
			level ++;
		}
		// print the result;
		printArraylistLinkedLists(result);
		//return result;
		return result;
	}
	
	
	
	// function to display our ArrayList of linkedList NoddeInt
	public static void printArraylistLinkedLists(ArrayList<LinkedList<NoddeInt>> res) {
		// we take in the result, then loop through the arraylist
		LinkedList<NoddeInt> list = new LinkedList<NoddeInt>();
		
		for(int i = 0 ; i <  res.size() ; i++) {
			System.out.println("#####################" + res);
			
			list = res.get(i);
		
			System.out.println("");
		}
		
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // create a tree and test it out
		binarySearchTree tree = new binarySearchTree();
		
		tree.root = new Nodde('a');
		tree.root.left = new Nodde('b');
		tree.root.right = new Nodde('c');
		tree.root.left.left= new Nodde('d');
		tree.root.left.right= new Nodde('e');
		tree.root.right.left = new Nodde('f');
		tree.root.right.right = new Nodde('g');
		tree.root.left.left.left = new Nodde('h');
		tree.root.left.left.right = new Nodde('i');
		tree.root.right.left.left = new Nodde('j');
		tree.root.right.left.right = new Nodde('k');
		
		// we have the tree ,now we can test out our functions
		printLevel(tree.root);
		
		binarySearchTree treeTwo = new binarySearchTree();
		
		NoddeInt root2 = new NoddeInt(5);
		root2.left = new NoddeInt(10);
		root2.right = new NoddeInt(15);
		root2.left.left = new NoddeInt(20);
		root2.left.right = new NoddeInt(25);
		root2.right.left = new NoddeInt(30);
	    root2.right.right = new NoddeInt(35);
		
		
		
		findLevelLinkedList(treeTwo.root2);
		
		
		
	}

}

class Nodde{
	Character key;
	
	Nodde left;
	Nodde right;
	
	Nodde(Character ch){
		this.key = ch;
	}
	
}
// create another node of the type integer
class NoddeInt{
	int key;
	
	NoddeInt left;
	NoddeInt right;
	
	NoddeInt(int data){
		this.key = data;
	}
	
}
	

