package Huffman;

public class FrequencyTuple implements Comparable<FrequencyTuple>{
    private char c;
    private int occurrences;

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

    @Override
    public int compareTo(FrequencyTuple o) {
        //TODO
        return 1;
    }
    
}
