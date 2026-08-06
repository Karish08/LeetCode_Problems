class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> ak = new HashMap<>();
        for(char c : s.toCharArray()){
            ak.put(c, ak.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) ->{ 
        if(a.getValue().equals(b.getValue())) return a.getKey().compareTo(b.getKey());
        return b.getValue() - a.getValue();
        });
        for(var entry : ak.entrySet()){
            pq.offer(entry);
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            int n = pq.peek().getValue();
            for(int i=0; i<n; i++){
                sb.append(pq.peek().getKey());
            }
            pq.poll();
        }return sb.toString();
    }
}