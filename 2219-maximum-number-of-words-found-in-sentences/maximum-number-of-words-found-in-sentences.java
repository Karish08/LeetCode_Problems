class Solution {
    public int mostWordsFound(String[] sentences) { 
        int max = 0;       
        for(String m : sentences){
            String ak[] = m.split("\\s+");
            max = Math.max(max, ak.length);
        } 
        return max;      
    }
}