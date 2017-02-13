package google;

public class ImplGraph {

	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(1, 2, 8);
		g.addEdge(2,3,6);
		g.addEdge(2,4,3);
		g.addEdge(3,4,-5);
		g.addEdge(4,5,2);
		g.addEdge(5,2,4);
		g.printEdges();
		boolean path = g.isPath(2,5);
		System.out.println(path);
		if(path)
			System.out.println("Path Exists");
		else
			System.out.println("No Path");
		g.printAll(2,5);
		
		g.shortest(2,5);
	}

}
