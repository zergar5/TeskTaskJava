import org.example.Graph;
import org.example.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class TestGraph extends Assert {

    @Test
    public void testHumanMap() throws FileNotFoundException {
        HashMap<Character, Integer> humanMap = new HashMap<>();
        humanMap.put('S', 5);
        humanMap.put('W', 2);
        humanMap.put('T', 3);
        humanMap.put('P', 1);
        HashMap<Character, Integer> nodesWeight = Graph.createMap("Human");
        assertEquals(nodesWeight, humanMap);
    }

    @Test
    public void testSwamperMap() throws FileNotFoundException {
        HashMap<Character, Integer> swamperMap = new HashMap<>();
        swamperMap.put('S', 2);
        swamperMap.put('W', 2);
        swamperMap.put('T', 5);
        swamperMap.put('P', 2);
        HashMap<Character, Integer> nodesWeight = Graph.createMap("Swamper");
        assertEquals(nodesWeight, swamperMap);
    }

    @Test
    public void testWoodmanMap() throws FileNotFoundException {
        HashMap<Character, Integer> woodmanMap = new HashMap<>();
        woodmanMap.put('S', 3);
        woodmanMap.put('W', 3);
        woodmanMap.put('T', 2);
        woodmanMap.put('P', 2);
        HashMap<Character, Integer> nodesWeight = Graph.createMap("Woodman");
        assertEquals(nodesWeight, woodmanMap);
    }

    @Test
    public void testHumanGraph() throws FileNotFoundException {
        Graph graph = new Graph("STWSWTPPTPTTPWPP", "Human");

        ArrayList<Node>[] humanGraph = new ArrayList[16];

        for (int i = 0; i < 16; i++) {
            humanGraph[i] = new ArrayList<Node>();
        }

        humanGraph[0].add(new Node(2, 4));
        humanGraph[0].add(new Node(3, 1));
        humanGraph[1].add(new Node(3, 5));
        humanGraph[1].add(new Node(2, 2));
        humanGraph[1].add(new Node(5, 0));
        humanGraph[2].add(new Node(1, 6));
        humanGraph[2].add(new Node(5, 3));
        humanGraph[2].add(new Node(3, 1));
        humanGraph[3].add(new Node(1, 7));
        humanGraph[3].add(new Node(2, 2));
        humanGraph[4].add(new Node(3, 8));
        humanGraph[4].add(new Node(3, 5));
        humanGraph[4].add(new Node(5, 0));
        humanGraph[5].add(new Node(1, 9));
        humanGraph[5].add(new Node(1, 6));
        humanGraph[5].add(new Node(2, 4));
        humanGraph[5].add(new Node(3, 1));
        humanGraph[6].add(new Node(3, 10));
        humanGraph[6].add(new Node(1, 7));
        humanGraph[6].add(new Node(3, 5));
        humanGraph[6].add(new Node(2, 2));
        humanGraph[7].add(new Node(3, 11));
        humanGraph[7].add(new Node(1, 6));
        humanGraph[7].add(new Node(5, 3));
        humanGraph[8].add(new Node(1, 12));
        humanGraph[8].add(new Node(1, 9));
        humanGraph[8].add(new Node(2, 4));
        humanGraph[9].add(new Node(2, 13));
        humanGraph[9].add(new Node(3, 10));
        humanGraph[9].add(new Node(3, 8));
        humanGraph[9].add(new Node(3, 5));
        humanGraph[10].add(new Node(1, 14));
        humanGraph[10].add(new Node(3, 11));
        humanGraph[10].add(new Node(1, 9));
        humanGraph[10].add(new Node(1, 6));
        humanGraph[11].add(new Node(1, 15));
        humanGraph[11].add(new Node(3, 10));
        humanGraph[11].add(new Node(1, 7));
        humanGraph[12].add(new Node(2, 13));
        humanGraph[12].add(new Node(3, 8));
        humanGraph[13].add(new Node(1, 14));
        humanGraph[13].add(new Node(1, 12));
        humanGraph[13].add(new Node(1, 9));
        humanGraph[14].add(new Node(1, 15));
        humanGraph[14].add(new Node(2, 13));
        humanGraph[14].add(new Node(3, 10));
        humanGraph[15].add(new Node(1, 14));
        humanGraph[15].add(new Node(3, 11));

        assertEquals(humanGraph, graph.getGraph());

    }

    @Test
    public void testSwamperGraph() throws FileNotFoundException {
        Graph graph = new Graph("STWSWTPPTPTTPWPP", "Swamper");

        ArrayList<Node>[] swamperGraph = new ArrayList[16];

        for (int i = 0; i < 16; i++) {
            swamperGraph[i] = new ArrayList<Node>();
        }

        swamperGraph[0].add(new Node(2, 4));
        swamperGraph[0].add(new Node(5, 1));
        swamperGraph[1].add(new Node(5, 5));
        swamperGraph[1].add(new Node(2, 2));
        swamperGraph[1].add(new Node(2, 0));
        swamperGraph[2].add(new Node(2, 6));
        swamperGraph[2].add(new Node(2, 3));
        swamperGraph[2].add(new Node(5, 1));
        swamperGraph[3].add(new Node(2, 7));
        swamperGraph[3].add(new Node(2, 2));
        swamperGraph[4].add(new Node(5, 8));
        swamperGraph[4].add(new Node(5, 5));
        swamperGraph[4].add(new Node(2, 0));
        swamperGraph[5].add(new Node(2, 9));
        swamperGraph[5].add(new Node(2, 6));
        swamperGraph[5].add(new Node(2, 4));
        swamperGraph[5].add(new Node(5, 1));
        swamperGraph[6].add(new Node(5, 10));
        swamperGraph[6].add(new Node(2, 7));
        swamperGraph[6].add(new Node(5, 5));
        swamperGraph[6].add(new Node(2, 2));
        swamperGraph[7].add(new Node(5, 11));
        swamperGraph[7].add(new Node(2, 6));
        swamperGraph[7].add(new Node(2, 3));
        swamperGraph[8].add(new Node(2, 12));
        swamperGraph[8].add(new Node(2, 9));
        swamperGraph[8].add(new Node(2, 4));
        swamperGraph[9].add(new Node(2, 13));
        swamperGraph[9].add(new Node(5, 10));
        swamperGraph[9].add(new Node(5, 8));
        swamperGraph[9].add(new Node(5, 5));
        swamperGraph[10].add(new Node(2, 14));
        swamperGraph[10].add(new Node(5, 11));
        swamperGraph[10].add(new Node(2, 9));
        swamperGraph[10].add(new Node(2, 6));
        swamperGraph[11].add(new Node(2, 15));
        swamperGraph[11].add(new Node(5, 10));
        swamperGraph[11].add(new Node(2, 7));
        swamperGraph[12].add(new Node(2, 13));
        swamperGraph[12].add(new Node(5, 8));
        swamperGraph[13].add(new Node(2, 14));
        swamperGraph[13].add(new Node(2, 12));
        swamperGraph[13].add(new Node(2, 9));
        swamperGraph[14].add(new Node(2, 15));
        swamperGraph[14].add(new Node(2, 13));
        swamperGraph[14].add(new Node(5, 10));
        swamperGraph[15].add(new Node(2, 14));
        swamperGraph[15].add(new Node(5, 11));

        assertEquals(swamperGraph, graph.getGraph());

    }

    @Test
    public void testWoodmanGraph() throws FileNotFoundException {
        Graph graph = new Graph("STWSWTPPTPTTPWPP", "Woodman");

        ArrayList<Node>[] woodmanGraph = new ArrayList[16];

        for (int i = 0; i < 16; i++) {
            woodmanGraph[i] = new ArrayList<Node>();
        }

        woodmanGraph[0].add(new Node(3, 4));
        woodmanGraph[0].add(new Node(2, 1));
        woodmanGraph[1].add(new Node(2, 5));
        woodmanGraph[1].add(new Node(3, 2));
        woodmanGraph[1].add(new Node(3, 0));
        woodmanGraph[2].add(new Node(2, 6));
        woodmanGraph[2].add(new Node(3, 3));
        woodmanGraph[2].add(new Node(2, 1));
        woodmanGraph[3].add(new Node(2, 7));
        woodmanGraph[3].add(new Node(3, 2));
        woodmanGraph[4].add(new Node(2, 8));
        woodmanGraph[4].add(new Node(2, 5));
        woodmanGraph[4].add(new Node(3, 0));
        woodmanGraph[5].add(new Node(2, 9));
        woodmanGraph[5].add(new Node(2, 6));
        woodmanGraph[5].add(new Node(3, 4));
        woodmanGraph[5].add(new Node(2, 1));
        woodmanGraph[6].add(new Node(2, 10));
        woodmanGraph[6].add(new Node(2, 7));
        woodmanGraph[6].add(new Node(2, 5));
        woodmanGraph[6].add(new Node(3, 2));
        woodmanGraph[7].add(new Node(2, 11));
        woodmanGraph[7].add(new Node(2, 6));
        woodmanGraph[7].add(new Node(3, 3));
        woodmanGraph[8].add(new Node(2, 12));
        woodmanGraph[8].add(new Node(2, 9));
        woodmanGraph[8].add(new Node(3, 4));
        woodmanGraph[9].add(new Node(3, 13));
        woodmanGraph[9].add(new Node(2, 10));
        woodmanGraph[9].add(new Node(2, 8));
        woodmanGraph[9].add(new Node(2, 5));
        woodmanGraph[10].add(new Node(2, 14));
        woodmanGraph[10].add(new Node(2, 11));
        woodmanGraph[10].add(new Node(2, 9));
        woodmanGraph[10].add(new Node(2, 6));
        woodmanGraph[11].add(new Node(2, 15));
        woodmanGraph[11].add(new Node(2, 10));
        woodmanGraph[11].add(new Node(2, 7));
        woodmanGraph[12].add(new Node(3, 13));
        woodmanGraph[12].add(new Node(2, 8));
        woodmanGraph[13].add(new Node(2, 14));
        woodmanGraph[13].add(new Node(2, 12));
        woodmanGraph[13].add(new Node(2, 9));
        woodmanGraph[14].add(new Node(2, 15));
        woodmanGraph[14].add(new Node(3, 13));
        woodmanGraph[14].add(new Node(2, 10));
        woodmanGraph[15].add(new Node(2, 14));
        woodmanGraph[15].add(new Node(2, 11));

        assertEquals(woodmanGraph, graph.getGraph());

    }

}

