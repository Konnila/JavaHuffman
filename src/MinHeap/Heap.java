package MinHeap;

public class Heap implements IHeap{
    private int size;
    private Node[] nodes;

    public Heap(int size) {
        //figure out size
        nodes = new Node[256];
    }
    
    @Override
    public void heapify() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
