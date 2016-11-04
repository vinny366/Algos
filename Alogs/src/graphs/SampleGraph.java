package graphs;

public class SampleGraph {

	public static void main(String[] args) {
		MyGraph g = new MyGraph(7, true);
		g.addEdge(1, 3);
		g.addEdge(2, 3);		
		g.addEdge(2, 5);
		g.addEdge(3, 4);
		g.addEdge(4, 6);
		g.addEdge(5, 6);
		g.addEdge(6, 7);
		System.out.println("pri");
		g.printGraph();
		g.topologicalSort();

	}


}
