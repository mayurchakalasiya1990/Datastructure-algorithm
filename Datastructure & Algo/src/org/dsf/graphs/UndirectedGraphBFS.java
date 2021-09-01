package org.dsf.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class UndirectedGraphBFS {

    static int Vertex=-1;
    static UndirectedGraph g=null;

    public static void BFS(int v,int totalVertex){
        boolean[] visited=new boolean[totalVertex];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        queue.add(v);
        visited[v]=true;
        while(!queue.isEmpty()){
            int curr=queue.poll();
            System.out.print(curr+" ");
            Iterator<Integer> adjNode= g.adj.get(curr).iterator();
            while(adjNode.hasNext()){
                int n= (int) adjNode.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Vertex=5;
        g=new UndirectedGraph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breath First Traversal (starting from vertex 2)");
        UndirectedGraphBFS.BFS(2,Vertex);
    }
}
