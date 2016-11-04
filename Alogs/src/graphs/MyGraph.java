package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import javax.xml.ws.soap.AddressingFeature;

class MyGraph {
	boolean isDirected = true;
	static int vertices ;
	public static LinkedList[] adjacencyList;
	
	MyGraph(int numberofvertices,boolean directed){
		this.isDirected = directed;
		this.vertices =  numberofvertices ;
		adjacencyList = new LinkedList[numberofvertices+1];
		
		for(int i=0 ; i<= numberofvertices;i++){
			if(i !=0)
				adjacencyList[i] = new LinkedList<Integer>();
		}
		
	}

	public void addEdge(int sourceNode, int destinationNode){
		System.out.println("adding " + sourceNode +"-->" + destinationNode);
		this.adjacencyList[sourceNode].add(destinationNode);
	}
	
	public  void printGraph(){
		System.out.println("This graph has " + this.vertices + "vertices");
		System.out.println("the adjacency List is");
		for(LinkedList<Integer> i : this.adjacencyList){
			System.out.println(i);
		}
	}

	public void topologicalSort() {		
		Stack<Integer> s = new Stack<Integer>();
		boolean[] visited = new boolean[this.vertices +1];
		
		for(int i =1; i<visited.length;i++){
			if(!visited[i]){
				topologicalSortUtil(i,visited,s);
			}
		}
		
		System.out.println("stack printing");
		while(!s.isEmpty()){			
			int y = s.pop();
			System.out.println(y);
		}
	}

	public static void topologicalSortUtil(int node, boolean[] visited, Stack<Integer> s){
		visited[node] = true;
		for(int i =0;i<adjacencyList[node].size(); i++){
			if(!visited[(int)adjacencyList[node].get(i)]){
				topologicalSortUtil((int)adjacencyList[node].get(i), visited, s);
			}
		}
		s.push(node);
	}
	
	
}
