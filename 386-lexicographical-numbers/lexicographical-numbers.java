class Solution {
    public List<Integer> lexicalOrder(int n) {
        PriorityQueue<Integer> pq =  new PriorityQueue<>((a,b) -> String.valueOf(a).compareTo(String.valueOf(b)));
        for(int i = 1; i<=n; i++){
            pq.offer(i);
        }
        ArrayList<Integer> m = new ArrayList<>();
        while(!pq.isEmpty()){
           m.add(pq.poll());
        }
        return m;
    }
}