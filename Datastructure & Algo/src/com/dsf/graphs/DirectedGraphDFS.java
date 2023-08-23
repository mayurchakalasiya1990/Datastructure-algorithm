package com.dsf.graphs;

import java.util.ArrayList;
import java.util.Iterator;

public class DirectedGraphDFS {
    /*
        - Acyclic graph
        - Directed Graph
     */

    static int Vertex=-1;
    static DirectedGraph g=null;

    static class DirectedGraph{
        ArrayList<ArrayList<Integer>> adj;
        int V;
        DirectedGraph(int v)
        {
            V = v;
            adj = new ArrayList<ArrayList<Integer> >(V);
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<Integer>());
        }

        void addEdge(int u, int v)
        {
            adj.get(u).add(v);
        }
    }

    static void DFS(DirectedGraph g, int startNode){
        System.out.println(startNode+" ");
        Iterator<Integer> iterator=g.adj.get(startNode).iterator();
        while (iterator.hasNext()){
            int curr=iterator.next();
            DFS(g, curr);
        }
    }

    public static void main(String[] args) {
        g=new DirectedGraph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal (starting from vertex 2)");
        DirectedGraphDFS.DFS(g,0);

    }
}
