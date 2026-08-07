class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> ak = new ArrayList<>();
        HashMap<String, Integer> m = new HashMap<>();
        String [] mj = s1.split("\\s+");
        String [] kn = s2.split("\\s+");
        for(String s : mj){
            m.put(s, m.getOrDefault(s,0)+1);
        }
        for(String s : kn){
            m.put(s, m.getOrDefault(s,0)+1);
        }  
        for(var entry : m.entrySet()){
            if(entry.getValue() == 1) ak.add(entry.getKey());
        }
        return ak.toArray(new String[0]);
    }
}