package org.dsf.graphs;


import java.util.Iterator;

public class GraphDFS {

    static int Vertex=-1;
    static Graph g=null;

    public void DFSUtil(int v, boolean visited[]){
        visited[v]=true;
        System.out.println(v);
        Iterator<Integer> i=g.adj.get(v).iterator();

        while (i.hasNext()){
            int n=i.next();
            if(!visited[n]){
                visited[n]=true;
                DFSUtil(n,visited);
            }
        }
    }

    public void DFS(int v){
    boolean[] visited=new boolean[Vertex];
    visited[v]=true;
    DFSUtil(v,visited);
    }

    public static void main(String[] args) {
        Vertex=5;
        g=new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal (starting from vertex 2)");
        GraphDFS dfs=new GraphDFS();
        dfs.DFS(2);
    }


}
