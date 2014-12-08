package Huffman;
import java.util.Comparator;

public class FrequencyTableComparator implements Comparator {
    //choose whether to sort by char or freq
    private final boolean useFrequency;
    
    public FrequencyTableComparator(boolean byFrequency) {
         this.useFrequency = byFrequency;
    }
    
    @Override
    public int compare(Object o1, Object o2) {
        FrequencyTuple tuple1 = (FrequencyTuple) o1;
        FrequencyTuple tuple2 = (FrequencyTuple) o2;
        
        if(o2 == null) return -1;
        
        int byFreq = tuple1.getOccurrences() > tuple2.getOccurrences() ? -1 : tuple1.getOccurrences() == tuple2.getOccurrences() ? 0 : 1;
        int byChar = tuple1.getC() > tuple2.getC() ? -1 : tuple1.getC() == tuple2.getC() ? 0 : 1;
        
        return useFrequency ? byFreq : byChar;
    }
    
}
