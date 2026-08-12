class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[!?',;.]"," ");
        String m[] = paragraph.split("\\s+");
        Map<String, Integer> ak = new HashMap<>();
        for(String s : m){
             s = s.toLowerCase();
             ak.put(s, ak.getOrDefault(s,0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if(a.getValue().equals(b.getValue())) return a.getKey().compareTo(b.getKey());
            return b.getValue() - a.getValue();
        });
        for(var entry : ak.entrySet()){
            pq.offer(entry);
        }
        String mj = String.join(" ", banned);
        while(!pq.isEmpty()){
            if(!mj.contains(pq.peek().getKey())) return pq.poll().getKey();
            pq.poll();
        }return "";
    }
}