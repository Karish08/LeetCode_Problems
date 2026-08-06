class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> ak = new HashMap<>();
        for(int i : nums){
            ak.put(i, ak.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        for(var entry : ak.entrySet()){
            pq.offer(entry);
        }
        int archana[] = new int[k];
        for(int i = 0; i<k; i++){
            archana[i] = pq.poll().getKey();
        }return archana;
    }
}