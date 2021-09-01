package org.dsf.graphs;

import org.dsf.sortingalgo.UnionOfSortedArrays;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ConnectedGraphCount {

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

    static int connectedGraphCount(UndirectedGraph g){
        int result =0;
        boolean[] visited=new boolean[g.V];
        for (int i = 0; i < g.adj.size(); i++) {
            ArrayList<Integer> node=g.adj.get(i);
            for (int currNode:node) {
                if(explore(g,currNode,visited)){
                    result++;
                }
            }
        }
        return result;
    }

    static boolean explore(UndirectedGraph g,int node, boolean[] visited){
        if(visited[node]) return false;
        visited[node]=true;
        Iterator<Integer> iterator=g.adj.get(node).iterator();
        while (iterator.hasNext()){
            int curr=iterator.next();
            explore(g,curr,visited);
        }
        return true;
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
        System.out.println("Connected Graph Count:"+connectedGraphCount(g));
    }

}
