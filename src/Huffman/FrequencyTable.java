package Huffman;

import java.util.Arrays;

public class FrequencyTable {
    private FrequencyTuple[] charFrequencies;

    public FrequencyTable() {
        this.charFrequencies = new FrequencyTuple[256];
    }
    
    public void getFrequencies(String message) {
        for ( char c  : message.toCharArray() ) {
            if(charFrequencies[c] == null) {
                charFrequencies[c] = new FrequencyTuple(c);
            }
            else {
                charFrequencies[c].increaseOccurrences();
            }
        }
    }
    
    public FrequencyTuple[] sort(boolean byFreq) {
        Arrays.sort(charFrequencies, new FrequencyTableComparator(byFreq));
       
        return charFrequencies;
    }
}
