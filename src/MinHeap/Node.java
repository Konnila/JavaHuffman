package MinHeap;

public class Node implements Comparable<Node>{
    private final char symbol;
    private int frequency;
    private int index;
    private Node left;
    private Node right;
    
    public Node(char symbol, int frequency, int index) {
        this.symbol = symbol;
        this.frequency = frequency;
        this.index = index;
    }
    
    public void setRight(Node node) {
        this.right = node;
    }
    
    public void setLeft(Node node) {
        this.left = node;
    }

    @Override
    public int compareTo(Node o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}