package org.example;

public class Node implements Comparable<Node> {

    public int weight;
    public int node;

    public Node(int weight, int node) {

        this.weight = weight;
        this.node = node;
    }

    public int compareTo(Node node) {
        return this.weight - node.weight;
    }

    @Override
    public boolean equals(Object obj) {
        Node node = (Node) obj;
        return this.weight == node.weight && this.node == node.node;
    }
}