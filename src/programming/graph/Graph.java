package programming.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Adjacency List
 */
public class Graph<T> {

    Map<Vertex<T>, List<Vertex<T>>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    public void addVertex(Vertex<T> vertex){
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex<T> from, Vertex<T> to){
        adjVertices.get(from).add(to);
        adjVertices.get(to).add(from);
    }


}
