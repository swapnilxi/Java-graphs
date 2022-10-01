import java.util.*;
class Solution {
    public static void main(String[] args) {
       int v=5;
        int e=10;
        //matrix method 
        int[][] a= new int[v+1][v+1];
        //adj list method 
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0; i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
       
    }
 static void addEdge(int[][] a, int source , int dest){
     a[source][dest]=1;
     a[dest][source]=1;
 }
 static void addEdge(ArrayList<ArrayList<Integer>> adj,int source, int dest){
     adj.get(source).add(dest);
     adj.get(dest).add(source);
 }
}
