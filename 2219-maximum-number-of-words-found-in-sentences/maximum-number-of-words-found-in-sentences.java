class Solution {
    public int mostWordsFound(String[] sentences) { 
        int kb[] = new int [sentences.length];
        int i = 0;       
        for(String m : sentences){
            String ak[] = m.split("\\s+");
            kb[i++] = ak.length;
        }  
        Arrays.sort(kb);
        return kb[kb.length - 1];      
    }
}