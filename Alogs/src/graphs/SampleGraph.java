package graphs;

public class SampleGraph {

	public static void main(String[] args) {
		MyGraph g = new MyGraph(5, true);
		g.addEdge(1, 3);
		g.addEdge(1, 2);
		g.addEdge(3, 4);
		g.addEdge(2, 5);
//		g.addEdge(4, 1);
		g.addEdge(5, 3);
		System.out.println("pri");
		g.printGraph();
		g.topologicalSort();

	}


}
