import org.example.AStar;
import org.example.Graph;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class TestAStar extends Assert {

    @Test
    public void testHeurictic415() {
        assertEquals(5, AStar.heurictic(4, 15));
    }

    @Test
    public void testHeurictic515() {
        assertEquals(4, AStar.heurictic(5, 15));
    }

    @Test
    public void testHeurictic915() {
        assertEquals(3, AStar.heurictic(9, 15));
    }

    @Test
    public void testHeurictic1315() {
        assertEquals(2, AStar.heurictic(13, 15));
    }

    @Test
    public void testHeurictic1415() {
        assertEquals(1, AStar.heurictic(14, 15));
    }

    @Test
    public void testHumanPath() throws FileNotFoundException {
        Graph graph = new Graph("STWSWTPPTPTTPWPP", "Human");
        AStar pathFind = new AStar(graph.getGraph());
        assertEquals(10, pathFind.getPath());
    }

    @Test
    public void testSwamperPath() throws FileNotFoundException {
        Graph graph = new Graph("STWSWTPPTPTTPWPP", "Swamper");
        AStar pathFind = new AStar(graph.getGraph());
        assertEquals(15, pathFind.getPath());
    }

    @Test
    public void testWoodmanPath() throws FileNotFoundException {
        Graph graph = new Graph("STWSWTPPTPTTPWPP", "Woodman");
        AStar pathFind = new AStar(graph.getGraph());
        assertEquals(12, pathFind.getPath());
    }

}
