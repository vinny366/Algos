package google;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

class Edge {
	int weight;
	int destination;

	public Edge(int des, int we) {
		this.destination = des;
		this.weight = we;
	}
}

@SuppressWarnings("all")
public class Graph {
	public static final int INF = 120000000;
	boolean isDirected = true;
	static int vertices;
	public static LinkedList<Edge>[] adjacencyList;

	public Graph(int vertices) {
		this.vertices = vertices;
		adjacencyList = new LinkedList[vertices + 1];
		for (int i = 1; i <= vertices; i++) {
			adjacencyList[i] = new LinkedList<Edge>();
		}
	}

	public void addEdge(int i, int j, int w) {
		Edge e = new Edge(j, w);
		adjacencyList[i].add(e);
	}

	public void printEdges() {
		for (int i = 1; i <= vertices; i++) {
			Iterator<Edge> ite = adjacencyList[i].listIterator();
			while (ite.hasNext()) {
				Edge ee = ite.next();
				System.out.println("The edge is from " + i + " to " + ee.destination + " with weight " + ee.weight);
			}
		}

	}

	public boolean isPath(int source, int dest) {
		Stack stack = new Stack();
		boolean visited[] = new boolean[vertices + 1];

		if (isPathUtil(source, dest, stack, visited)) {
			while (!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
			return true;
		} else {
			return false;
		}
	}

	private boolean isPathUtil(int source, int dest, Stack stack, boolean[] visited) {

		if (!visited[source])
			stack.add(source);
		visited[source] = true;
		if (source == dest)
			return true;
		for (int i = 0; i < adjacencyList[source].size(); i++) {
			if (!visited[adjacencyList[source].get(i).destination]) {
				boolean flag = isPathUtil(adjacencyList[source].get(i).destination, dest, stack, visited);
				if (flag) {
					return true;
				} else {
					stack.pop();
				}
			}
		}
		return false;
	}

	public void printAll(int so, int dest) {
		ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
		ArrayList<Integer> path = new ArrayList<>();
		printAllUtil(so, dest, allPaths, path);

	}

	private void printAllUtil(int so, int dest, ArrayList<ArrayList<Integer>> allPaths, ArrayList<Integer> path) {
		path.add(so);
		if (so == dest) {
			ArrayList<Integer> temp = new ArrayList<>();
			for (int i : path) {
				temp.add(i);
			}
			allPaths.add(temp);
			System.out.println(path.contains(so));
			path.remove((Object) so);
		}

		for (int i = 0; i < adjacencyList[so].size(); i++) {
			int dd = adjacencyList[so].get(i).destination;
			if (!path.contains(dd))
				printAllUtil(dd, dest, allPaths, path);
		}
		path.remove((Object) so);
	}

	public void shortest(int so, int dest) {
		int[][] distanceMtrx = generateDistanceMatrix();
		allPairShortest(distanceMtrx,so,dest);
		
	}

	private void allPairShortest(int[][] distanceMtrx,int so,int dest) {
		int[][] distance = new int[vertices + 1][vertices + 1];
		int[][] path = new int[vertices + 1][vertices + 1];

		for (int i = 1; i <= vertices; i++) {
			for (int j = 1; j <= vertices; j++) {
				distance[i][j] = distanceMtrx[i][j];

				if (distanceMtrx[i][j] != INF && i != j) {
					path[i][j] = i;
				} else {
					path[i][j] = -1;
				}
			}
		}
		
		for(int k=1; k<=vertices;k++){
			for(int i=1; i<=vertices; i++){
				for(int j = 1; j<=vertices;j++){
					if(distance[i][k] == INF || distance[k][j] ==INF)
						continue;
					else if(distance[i][j] > distance[i][k] + distance[k][j]){
						distance[i][j] = distance[i][k] + distance[k][j];
						path[i][j] = path[k][j];
					}
				}
			}
		}
		
		for(int i=1;i<=vertices;i++){
			for(int j=1;j<=vertices;j++){
				System.out.print(path[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------");
		Stack s = new Stack();
		s.push(dest);
		while(true){
			dest = path[so][dest];
			if(dest == -1)
				return;
			s.push(dest);
			if(so==dest)
				break;
		}
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		
	} // allpair
	
	
	
	
	
	private int[][] generateDistanceMatrix() {
		int[][] distanceMtrx = new int[vertices + 1][vertices + 1];
		int[][] pathMtrx = new int[vertices + 1][vertices + 1];

		for (int i = 1; i <= vertices; i++) {
			for (int j = 1; j <= vertices; j++) {
				distanceMtrx[i][j] = INF;
			}
		}

		for (int i = 1; i <= vertices; i++) {
			Iterator<Edge> ite = adjacencyList[i].listIterator();
			while (ite.hasNext()) {
				Edge e = ite.next();
				distanceMtrx[i][e.destination] = e.weight;
			}
		}

		for (int i = 0; i <= vertices; i++) {
			for (int j = 0; j <= vertices; j++) {
				if (!(distanceMtrx[i][j] == INF))
					System.out.print(distanceMtrx[i][j] + " ");
				else {
					System.out.print("INF ");
				}
			}
			System.out.println();
		}

		return distanceMtrx;
	}

}
