class Solution {
    public int findTheWinner(int n, int k) {
       List<Integer> ak = new ArrayList<>();
       for(int i = 1; i<=n; i++){
           ak.add(i);
       } 
       ListRemove(ak, 0, k);
       return ak.get(0);
    }
    static void ListRemove(List<Integer> m, int i, int k){
        if(m.size() == 1) return;
        i = (i + k - 1) % m.size();
        m.remove(i);
        ListRemove(m, i, k);
    }
}