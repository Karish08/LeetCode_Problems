class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean ak[] = new boolean[s.length() + 1];
        ak[0] = true;
        for(int i = 1; i<= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(ak[j] && wordDict.contains(s.substring(j, i))){
                    ak[i] = true;
                    break;
                }
            }
        }
        if(ak[ak.length - 1] == true) return true;
        return false; 
    }
}