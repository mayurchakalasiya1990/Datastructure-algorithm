package org.dsf.graphs;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adj;
    int V;
    Graph(int v)
    {
        V = v;
        adj = new ArrayList<ArrayList<Integer> >(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
    }

    void addEdge(int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void printAdjacencyList()
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list of " + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

class test{

    public static void main(String[] args) {
        // Creating a graph with 5 vertices
        int V = 5;

        Graph g = new Graph(V);

        // Adding edges one by one.
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.printAdjacencyList();
    }
}