package programming.graph;

import java.util.ArrayList;

public class Vertex<T> {

    T value;
    int in;
    int out;
    ArrayList<Vertex> nextVertexes;
    ArrayList<Edge> edges;

    public Vertex(T value) {
        this.value = value;
        this.in = 0;
        this.out = 0;
        this.nextVertexes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }
}
