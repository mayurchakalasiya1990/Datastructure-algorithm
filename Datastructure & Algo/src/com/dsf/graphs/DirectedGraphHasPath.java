package com.dsf.graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DirectedGraphHasPath {

    /*
        - Acyclic graph
        - Directed Graph
     */
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

    public static boolean hashPathDFS(DirectedGraph g, int src, int dest){
        if(src==dest) return true;
        Iterator<Integer> adjNodes=g.adj.get(src).iterator();
        while(adjNodes.hasNext()){
            int node =adjNodes.next();
            if(hashPathDFS(g,node,dest))
                return true;
        }
        return false;
    }

    public static boolean hashPathBFS(DirectedGraph g, int src, int dest){
        if(src==dest) return true;
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(src);
        while (!queue.isEmpty()){
            int curr=queue.poll();
            if(curr==dest){
                return true;
            }
            Iterator<Integer> adjNodes=g.adj.get(curr).iterator();
            while (adjNodes.hasNext()){
                int node=adjNodes.next();
                queue.add(node);
                if(node==dest){
                    return true;
                }
            }
        }

        return false;
    }



    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        int src=0;
        int dest=3;
        //System.out.println("hash Path FROM "+src+" to "+dest+" ? "+hashPathDFS(g,src,dest));
        System.out.println("hash Path FROM "+src+" to "+dest+" ? "+hashPathBFS(g,src,dest));
    }

}
