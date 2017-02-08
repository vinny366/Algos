package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
@SuppressWarnings("all") 
public class PathinUndirectedGraph {

	public static void main(String[] args) {
		MyGraph g = new MyGraph(7, false);
		g.addEdge(1, 3);
		g.addEdge(2, 3);		
		g.addEdge(2, 5);
		g.addEdge(3, 4);
		g.addEdge(4, 6);
//		g.addEdge(5, 6);
//		g.addEdge(6, 7);
		for(int i=0;i<g.getVertices()+1;i++){
			System.out.println(g.adjacencyList[i]);
		}
		
		Stack<Integer> s = new Stack<Integer>();
		boolean pathExists = findPath(2, 7, s, g.adjacencyList, -1);
		System.out.println(pathExists);
	}

	public static boolean findPath(int start, int end, Stack s, LinkedList[] adjacencyList,int parent) {
		s.add(start);
		if(start == end){
			return true;
		}
		else{
			Iterator<Integer> i = adjacencyList[start].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(parent != n){
					s.push(n);
					boolean flag = findPath(n, end, s, adjacencyList, start);
					if(flag){
						return true;
					}else{
						s.pop();
					}
				}
			}
		}
		
		return false;
	}	
	

}
