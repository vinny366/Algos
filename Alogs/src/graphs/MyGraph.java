package graphs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

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
	
	public int getVertices(){
		return this.vertices;
	}
	public LinkedList[] getadjacencyList(){
		return this.adjacencyList;
	}

	public void addEdge(int sourceNode, int destinationNode){
		System.out.println("adding " + sourceNode +"-->" + destinationNode);
		this.adjacencyList[sourceNode].add(destinationNode);
		this.adjacencyList[destinationNode].add(sourceNode);  // remove this for directed graph
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
		boolean[] visited = new boolean[this.vertices + 1];
		for(int i=1;i<visited.length;i++){
			if(!visited[i]){
				topologicalSortUtil(i,visited,s);
			}
		}
		// Printing the elements from stack
		while(!s.isEmpty()){
			System.out.print(s.pop()+"--> ");
		}
		
	}

	public static void topologicalSortUtil(int node, boolean[] visited, Stack<Integer> s){		
			visited[node] = true;
			for(int i=0;i<adjacencyList[node].size();i++){
				if(!visited[(int) adjacencyList[node].get(i)]){
					topologicalSortUtil(i,visited,s);
				}
			}
			s.push(node);
	}

	public boolean findCycleUndirected(int vertexNum) {
		System.out.println("In find undirected cycle");
		if(vertexNum > this.vertices){
			System.out.println("Vertex Number is out of Bounds");
			return false;
		}
		Set<Integer> visitedSet = new HashSet();
		if(cycleUndirectedUtil(vertexNum,visitedSet,0))
			return true;
		return false;
		
	}

	private boolean cycleUndirectedUtil(int vertexNum, Set<Integer> visitedSet,int parent) {
		if(visitedSet.contains(vertexNum))
			return true;
		visitedSet.add(vertexNum);
		Iterator<Integer> i = adjacencyList[vertexNum].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if(!visitedSet.contains(n)){            	
	            cycleUndirectedUtil(n, visitedSet,vertexNum);	            	
            }else if(n!=parent){
            	return true;
            }            
        }
		return false;						
	}	
}
