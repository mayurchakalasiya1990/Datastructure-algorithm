package org.dsf.graphs;



import java.util.ArrayList;
import java.util.Iterator;

public class LargestComponentOfGraph {
    static class UndirectedGraph {
        ArrayList<ArrayList<Integer>> adj;
        int V;

        UndirectedGraph(int v) {
            V = v;
            adj = new ArrayList<ArrayList<Integer>>(V);
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<Integer>());
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        void printAdjacencyList() {
            for (int i = 0; i < adj.size(); i++) {
                System.out.println("Adjacency list of " + i);
                for (int j = 0; j < adj.get(i).size(); j++) {
                    System.out.print(adj.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    static int largestConnectedGraphCount(UndirectedGraph g){
        boolean[] visited=new boolean[g.V];
        int longest=0;
        for (int i = 0; i < g.adj.size(); i++) {
            ArrayList<Integer> node=g.adj.get(i);
            for (int currNode:node) {
                int size=explore(g,currNode,visited);
                if(size>longest){
                    longest=size;
                }
            }
        }
        return longest;
    }

    static int explore(UndirectedGraph g, int node, boolean[] visited){
        if(visited[node]) return 0;
        visited[node]=true;
        Iterator<Integer> iterator=g.adj.get(node).iterator();
        int size=1;
        while (iterator.hasNext()){
            int curr=iterator.next();
            size+=explore(g,curr,visited);
        }
        return size;
    }



    public static void main(String[] args) {
        // Creating a graph with 5 vertices
        int V = 9;

        UndirectedGraph g = new UndirectedGraph(V);

        // Adding edges one by one.
        g.addEdge(0, 8);
        g.addEdge(0, 1);
        g.addEdge(0, 5);
        g.addEdge(8, 5);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(6, 7);

        //g.printAdjacencyList();
        System.out.println("Connected Graph Count:"+largestConnectedGraphCount(g));
    }

}
