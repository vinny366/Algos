package graphs;

public class SampleGraph {

	public static void main(String[] args) {
		MyGraph g = new MyGraph(6, true);
		g.addEdge(1, 3);
		g.addEdge(2, 3);		
		g.addEdge(2, 5);
		g.addEdge(3, 4);
		g.addEdge(4, 6);
//		g.addEdge(5, 6);
//		g.addEdge(6, 7);
		
			g.printGraph();
//		System.out.println("Topological------------------");
		g.topologicalSort();
//		boolean result = g.findCycleUndirected(2);
//		if(result){
//			System.out.println("There is cycle");
//		}else{
//			System.out.println("No cyce");
//		}

	}


}
