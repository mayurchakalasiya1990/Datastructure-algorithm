package org.dsf.graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Arrays;
public class UndirectedGraphShortPath {


    static class UndirectedGraph {
        ArrayList<ArrayList<Integer>> adj;
        int V;
        UndirectedGraph(int v)
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


    static int[] findShortestPath(UndirectedGraph g, int u){
        boolean[] visited=new boolean[g.V];
        LinkedList<Integer> queue=new LinkedList<Integer>();

        int[] distance=new int[g.V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        queue.add(u);

        visited[u]=true;
        distance[u]=0;
        while (!queue.isEmpty()){
            u=queue.poll();
            Iterator<Integer> iterator=g.adj.get(u).iterator();
            while (iterator.hasNext()){
                int v=iterator.next();
                if(!visited[v]){
                    distance[v]=distance[u]+1;
                    visited[v]=true;
                    queue.add(v);
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {

        UndirectedGraph g=new UndirectedGraph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(0,2);
        g.addEdge(1,3);

        int[] distance= findShortestPath(g,0);
        System.out.println(Arrays.toString(distance));

    }

}
