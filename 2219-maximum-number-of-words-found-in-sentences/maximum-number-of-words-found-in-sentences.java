class Solution {
    public int mostWordsFound(String[] sentences) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for(String m : sentences){
            String ak[] = m.split("\\s+");
            pq.offer(ak.length);
        }
        return pq.poll();
    }
}