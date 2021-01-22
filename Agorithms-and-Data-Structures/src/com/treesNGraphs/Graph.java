package com.treesNGraphs;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	//number of total vertices
    int vertex;
    
    // array of lists for adjacency list representations
    LinkedList<Integer> list[];
    
    // constructor
    @SuppressWarnings("unchecked")
	public Graph(int vertex) {
    	this.vertex = vertex;
    	list = new LinkedList[vertex];
    	for(int i = 0 ; i < vertex ; i++) {
    		//f or each vertex , create an a lost
    		list[i] = new LinkedList<>();
    	}
    	
    }
   // add an edge into the graph
    public void addEdge(int source, int destination) {
    	list[source].addFirst(destination);
    }
    
    public void DFS() {
    	System.out.println("Depth First Traversal");
    	boolean[] visited = new boolean[vertex];
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	for(int startIndex = 0 ; startIndex < vertex ; startIndex++) {
    		if(visited[startIndex] == false) {
    			stack.push(startIndex);
    			visited[startIndex] = true;
    			
    			while(stack.isEmpty() == false ) {
    				int nodeIndex = stack.pop();
    			
    			System.out.println(nodeIndex + " ");
    			
    			LinkedList<Integer> nodeList = list[nodeIndex];
    			
    			for(int i =0 ; i < nodeList.size(); i++) {
    				int dest = nodeList.get(i);
    				if(visited[dest] == false) {
    					stack.push(dest);
    					visited[dest] = true;
    				}
    			}
    		  }
    		}
    	}
    	
    	System.out.println();
    }
    
    public void printGraph() {
    	for(int i = 0 ; i < vertex; i ++) {
    		LinkedList<Integer> nodeList = list[i];
    		if(nodeList.isEmpty() == false) {
    			System.out.println("source = " + i + " is connected to nodes: ");
    			for(int j = 0; j < nodeList.size(); j++) {
    				System.out.print(" " + nodeList.get(j));
    			}
    		}
    		System.out.println();
    	}
    }
     // main function
   public static void main(String[]  args) {
	   Graph graph = new Graph(6);
	   graph.addEdge(0, 1);
       graph.addEdge(0, 2);
       graph.addEdge(1, 2);
       graph.addEdge(1, 3);
       graph.addEdge(3, 4);
       graph.addEdge(2, 3);
       graph.addEdge(4, 0);
       graph.addEdge(4, 1);
       graph.addEdge(4, 5);
       graph.printGraph();
       graph.DFS();
	   
   }
    
}
