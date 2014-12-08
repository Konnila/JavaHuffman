package Huffman;

public class FrequencyCalculator {
    public static int[] calculateFrequencies(String message) {
        int[] freqs = new int[256];
        
        for (char c : message.toCharArray()) {
            freqs[c]++;
        }
        
        return freqs;
    }
    
}
