import java.util.ArrayList;
  // Undirected and Weighted  Gaph
public class graph {

    /* Creating Edge Node / Vertex */
    public static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    /* Creating the Graph */
    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 1));
    }

    public static void neibore(ArrayList<Edge> graph[] , int m) {
        
            for (int i = 0; i < graph[m].size(); i++) {
                Edge e = graph[m].get(i);
                System.out.print( e.dest+ " ");
            }
    
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        neibore(graph,2);

    }
}