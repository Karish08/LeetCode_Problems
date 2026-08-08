class Solution {
    public List<String> stringMatching(String[] words) {
        // Set<String> mj = new HashSet<>();
        List<String> ak = new ArrayList<>();
        for(int i = 0; i<words.length; i++){
            String m = words[i];
            for(int j = 0; j<words.length; j++){
                if(i != j && m.indexOf(words[j])!= -1) {
                    if(!ak.contains(words[j])) ak.add(words[j]);
                } 
            } 
        }
        // for(String love : mj){
        //     ak.add(love);
        // }
        return ak;
    }
}