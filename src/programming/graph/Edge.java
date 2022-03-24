package programming.graph;

public class Edge {

    int weight;
    Vertex from;
    Vertex to;
    public Edge(int weight, Vertex from, Vertex to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }

}
