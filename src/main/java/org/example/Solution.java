package org.example;

import java.io.FileNotFoundException;

public class Solution {

    public static void getResult(String race, String area) throws FileNotFoundException {
        Graph graph = new Graph(area, race);
        AStar pathFind = new AStar(graph.getGraph());
        System.out.print("Shortest path: ");
        System.out.println(pathFind.getPath());
    }
}
