package org.dsf.graphs;

import java.util.Iterator;

public class DisConnGraphDFS {

    static int vertex=5;
    static Graph g=null;



    public static void DFSIUtil(int v, boolean visited[]){

        // Mark the current node as visited and print it
        visited[v]=true;
        System.out.println(v+" ");


        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i=g.adj.get(v).iterator();

        while (i.hasNext()){
            int n=i.next();
            if (!visited[n]){
                visited[n]=true;
                DFSIUtil(n,visited);
            }
        }

    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    public static  void DFS(){
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean[] visited=new boolean[vertex];

        // Call the recursive helper function to print DFS traversal
        // starting from all vertices one by one
        for (int i=0;i<=vertex;i++){
            DFSIUtil(i,visited);
        }

    }

    public static void main(String[] args) {

        g=new Graph(vertex);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal");

        DisConnGraphDFS.DFS();

    }

}
