package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Graph {

    private HashMap<Character, Integer> nodesWeight;

    private ArrayList<Node>[] graph;

    public Graph(String field, String race) throws FileNotFoundException {
        this.nodesWeight = createMap(race);
        this.graph = createGraph(this.nodesWeight, field);
        this.nodesWeight.clear();
    }

    public static HashMap<Character, Integer> createMap(String race) throws FileNotFoundException {

        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Character, Integer> map = new HashMap<>();
        String in = scanner.nextLine().replaceAll("\\s*", "");
        char[] zones = in.toCharArray();
        String[] move;

        do {

            in = scanner.nextLine();
            move = in.split(" ");

        } while (!race.equals(move[0]));

        for (int i = 0; i < 4; i++) {
            map.put(Character.valueOf(zones[i]), Integer.parseInt(move[i + 1]));
        }
        scanner.close();

        return map;

    }

    private static ArrayList<Node>[] createGraph(HashMap map, String field) {

        ArrayList<Node>[] graph = new ArrayList[16];

        for (int i = 0; i < 16; i++) {
            graph[i] = new ArrayList<Node>();
            //cell below the current one
            if (i <= 11) {
                graph[i].add(new Node((int) map.get(Character.valueOf(field.charAt(i + 4))), i + 4));
            }
            //cell to the right of the current one
            if ((i + 1) % 4 != 0) {
                graph[i].add(new Node((int) map.get(Character.valueOf(field.charAt(i + 1))), i + 1));
            }
            //cell to the left of the current one
            if (i % 4 != 0) {
                graph[i].add(new Node((int) map.get(Character.valueOf(field.charAt(i - 1))), i - 1));
            }
            //cell above the current one
            if (i >= 4) {
                graph[i].add(new Node((int) map.get(Character.valueOf(field.charAt(i - 4))), i - 4));
            }
        }

        return graph;
    }

    public ArrayList<Node>[] getGraph() {
        return this.graph;
    }

}

