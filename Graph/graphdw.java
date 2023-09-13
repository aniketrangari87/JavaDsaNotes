import java.util.ArrayList;

public class graphdw {


    public static class Edge{


        int src ; 
        int dest ;
        int wt;
      

        Edge( int src , int dest  , int wt){
            this.src=src ;
            this.dest = dest ;
            this.wt= wt;
        }
    
    }
     /* Creating the Graph */
    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 3,10));
        graph[2].add(new Edge(2, 1,-1));
        
        graph[3].add( new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));

    }
    public static void neibore(ArrayList<Edge> graph[] , int m) {
        
        for (int i = 0; i < graph[m].size(); i++) {
            Edge e = graph[m].get(i);
            System.out.println( e.dest+ "  , " +e.wt);
        }
     

}
    

    public static void main(String[] args) {

           int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        neibore(graph,2);

        
    }
}
