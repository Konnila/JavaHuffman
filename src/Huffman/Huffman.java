package Huffman;
import MinHeap.*;
import java.io.IOException;

public class Huffman {
    private IHeap heap;
    private final int size = 256; 
    private FrequencyTable freqTable;
    
    public Huffman() {
        heap = new Heap(256);
        freqTable = new FrequencyTable();
    }
    
    public void calculateFrequencies(String message) {
        freqTable.getFrequencies(message);
    }
    
    public static void main(String[] args) throws IOException, Exception {
        if(args.length == 0) 
            throw new Exception("Invalid arguments. Add input filename and output filename");
        
        Huffman huffman = new Huffman();
        huffman.calculateFrequencies(args[0]);
        
        
        
        //compress
        String input = args[0];
        
    }
}
