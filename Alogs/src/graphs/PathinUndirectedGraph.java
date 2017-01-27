package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
@SuppressWarnings("all") 
public class PathinUndirectedGraph {

	public static void main(String[] args) {
		MyGraph g = new MyGraph(7, true);
		g.addEdge(1, 3);
//		g.addEdge(2, 3);		
		g.addEdge(2, 5);
		g.addEdge(3, 4);
		g.addEdge(4, 6);
		g.addEdge(5, 6);
		g.addEdge(6, 7);
		Stack<Integer> tracker = new Stack<Integer>();
		boolean isPathexists = findpath(1,6,g.getVertices(),g.getadjacencyList(),tracker);
		if(isPathexists)
			System.out.println("Yes");
		else
			System.out.println("false");
		
		while(!tracker.isEmpty()){
			System.out.print(tracker.pop() +",");
		}
	}

	private static boolean findpath(int startNode, int endNode,int vertices,LinkedList[] adj,Stack tracker) {
		if(startNode>vertices || endNode>vertices )
			return false;
		if(startNode == endNode)
			return true;
		
		
		tracker.add(startNode);
		return existsPath(startNode,endNode,tracker,adj,-1);
		
	}
	
	public static boolean existsPath(int startNode,int endNode,Stack tracker,LinkedList[] adj,int parent){
		if(startNode == endNode){ 
			return true;
		}else{
		Iterator<Integer> i = adj[startNode].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if(n!=parent){
				boolean flag;
				tracker.add(n);
				flag = existsPath(n,endNode,tracker,adj,startNode);
				if(flag){
					return true;
				}else{
					tracker.pop();
				}
			}
		}
		return false;
		}
	}

}
