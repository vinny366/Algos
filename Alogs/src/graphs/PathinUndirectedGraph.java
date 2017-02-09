package graphs;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;

@SuppressWarnings("all")
public class PathinUndirectedGraph {

	public static void main(String[] args) {
		MyGraph g = new MyGraph(7, true);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(2, 5);
		g.addEdge(3, 4);
		g.addEdge(4, 6);
		g.addEdge(5, 6);
		g.addEdge(6, 7);
		// ------------------------
		// Adjacency---------------------------------------------
		// for (int i = 0; i < g.getVertices() + 1; i++) {
		// System.out.println(g.adjacencyList[i]);
		// }

		// ------------------------
		// Adjacency---------------------------------------------
		// boolean[] visited = new boolean[g.vertices + 1];
		// Stack<Integer> s = new Stack<Integer>();
		// boolean pathExists = findPath(2, 7, s, g.adjacencyList, -1, visited);
		// System.out.println(pathExists);
		// System.out.println("Stack");
		// while (!s.isEmpty()) {
		// System.out.println(s.pop());
		// }

		findAllPaths(2, 6, g);

	}

	public static void findAllPaths(int i, int j, MyGraph g) {
		ArrayList<LinkedHashSet<Integer>> paths = new ArrayList<LinkedHashSet<Integer>>();

		UtilAllPaths(i, j, paths, new LinkedHashSet<Integer>(), g);
		System.out.println(paths);
		
	}

	public static void UtilAllPaths(int start, int end, ArrayList<LinkedHashSet<Integer>> allpaths,
			LinkedHashSet<Integer> path, MyGraph g) {
		path.add(start);
		if (start == end) {
			
			LinkedHashSet<Integer> temp = new LinkedHashSet<>();
			for(int i :path){
				temp.add(i);
			}
			allpaths.add(temp);
			path.remove(start);
			
		}
		
		for(int i= 0; i<g.adjacencyList[start].size();i++){
			if(!path.contains((int)g.adjacencyList[start].get(i))){
				UtilAllPaths((int) g.adjacencyList[start].get(i),end,allpaths,path,g);
			}
		}
		path.remove(start);

	}

	public static boolean findPath(int start, int end, Stack s, LinkedList[] adjacencyList, int parent,
			boolean[] visited) {
		visited[start] = true;
		s.add(start);
		if (start == end) {
			return true;
		} else {
			Iterator<Integer> i = adjacencyList[start].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (parent != n) {
					if (visited[n] == false) {
						boolean flag = findPath(n, end, s, adjacencyList, start, visited);
						if (flag) {
							return true;
						} else {
							s.pop();
						}
					}
				}
			}
		}

		return false;
	}

}
