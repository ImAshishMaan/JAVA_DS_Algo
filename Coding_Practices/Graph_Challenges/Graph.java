package Graph_Challenges.java;

import java.util.*;

class Graph{
    class Vertices{
        HashMap<String, Integer> nbrs = new HashMap<>();
    }

    HashMap<String, Vertices> vtces = new HashMap<>();

    public int numVertex(){
        return vtces.size();
    }

    public boolean containsVertex(String vname){
        return vtces.containsKey(vname);
    }

    public void addVertex(String vname){
        Vertices vtx = new Vertices();
        vtces.put(vname, vtx);

    }

    public void removeVertex(String vname){
        if(!vtces.containsKey(vname)){
            System.out.println("Vertex not present");
        }else {
            Vertices vtx = vtces.get(vname);
            ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
            for (String key : keys) {
                Vertices vtx1 = vtces.get(key);
                vtx1.nbrs.remove(vname);
            }
            vtces.remove(vname);
        }
    }

    public int numEdges(){
        int count = 0;
        ArrayList<String> keys = new ArrayList<>(vtces.keySet());
        for(String key : keys){
            Vertices vtx = vtces.get(key);
            count = count + vtx.nbrs.size();
        }
        return count/2;

    }
    public boolean containEdge(String vname1, String vname2){
        if(!vtces.containsKey(vname1) || !vtces.containsKey(vname2)){
            return false;
        }
        Vertices vtx1 = vtces.get(vname1);
        if(!vtx1.nbrs.containsKey(vname2)){
            return false;
        }
        return true;

    }
    public void addEdge(String vname1, String vname2, int cost){
        if(!vtces.containsKey(vname1) || !vtces.containsKey(vname2)){
            System.out.println("Vertex not present");
        }else {
            Vertices vtx1 = vtces.get(vname1);
            Vertices vtx2 = vtces.get(vname2);
            if (vtx1.nbrs.containsKey(vname2)) {
                System.out.println("Edge is already there");
            } else {
                vtx1.nbrs.put(vname2, cost);
                vtx2.nbrs.put(vname1, cost);
            }
        }
    }
    public void removeEdge(String vname1, String vname2) {
        if (!vtces.containsKey(vname1) || !vtces.containsKey(vname2)) {
            System.out.println("Vertex not present");
        } else {
            Vertices vtx1 = vtces.get(vname1);
            Vertices vtx2 = vtces.get(vname2);
            if (vtx1.nbrs.containsKey(vname2)) {
                vtx1.nbrs.remove(vname2);
                vtx2.nbrs.remove(vname1);
            }
        }
    }
    public void display(){
        System.out.println("-----------------------");
        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        for(String key : keys){

            Vertices vtx = vtces.get(key);
            System.out.println(key + " : " + vtx.nbrs);
        }
        System.out.println("-----------------------");
    }
    public static void main(String[] args){
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.display();
        graph.addEdge("A", "B",2);
        graph.addEdge("A", "B",2);
        graph.addEdge("A", "D",2);
        graph.addEdge("B", "C",2);
        graph.addEdge("C", "D",2);
        graph.addEdge("D", "E",2);
        graph.addEdge("E", "F",2);
        graph.display();
        graph.removeVertex("A");
        graph.removeVertex("G");
        graph.display();
        graph.addEdge("F","B",3);
        graph.addEdge("F","E",3);
        graph.display();
        
    }
}
