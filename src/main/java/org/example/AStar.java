package org.example;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class AStar {

    private int path;

    public AStar(ArrayList<Node>[] graph) {
        this.path = findPath(graph);

    }

    private static int findPath(ArrayList<Node>[] graph) {

        int start = 0;
        int goal = 15;

        ArrayList<Integer> moveCost = new ArrayList<>();
        ArrayList<Integer> cameFrom = new ArrayList<>();
        ArrayList<Boolean> visited = new ArrayList<>();

        moveCost.add(start, 0);
        cameFrom.add(start, null);
        visited.add(start, false);
        for (int i = 1; i < 16; i++) {
            moveCost.add(i, Integer.MAX_VALUE);
            cameFrom.add(i, null);
            visited.add(i, false);
        }

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Node(0, start));

        while (!priorityQueue.isEmpty()) {
            int currentNode = priorityQueue.poll().node;
            visited.set(currentNode, true);
            if (currentNode == goal) {
                break;
            }

            for (var neighbor :
                    graph[currentNode]) {

                int neighborCost = neighbor.weight;
                int neighborNode = neighbor.node;
                int newCost = moveCost.get(currentNode) + neighborCost;

                if (!visited.get(neighborNode) && (!moveCost.contains(neighborNode) ||
                        newCost < moveCost.get(neighborNode))) {
                    int priority = newCost + heurictic(neighborNode, goal);
                    priorityQueue.add(new Node(priority, neighborNode));
                    moveCost.set(neighborNode, newCost);
                    cameFrom.set(neighborNode, currentNode);

                }
            }
        }
        return moveCost.get(goal);
    }

    public static int heurictic(int a, int b) {
        return Math.abs(a % 4 - b % 4) + Math.abs(a / 4 - b / 4);
    }

    public int getPath() {
        return this.path;
    }

}
