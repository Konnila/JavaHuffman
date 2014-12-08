package Huffman;

public class FrequencyTuple {
    private char c;
    private int occurrences;
    private int[] bytes;

    public FrequencyTuple(char c) {
        this.c = c;
        this.occurrences = 1;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(int occurrences) {
        this.occurrences = occurrences;
    }
    
    public void increaseOccurrences() {
        occurrences++;
    }
}
