class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> ak = new HashMap<>();
        int rank = 1;
        Set<Integer> m = new TreeSet<>();
        for(int i : arr){
            m.add(i);
        }
        for(int i : m){
            ak.put(i, rank);
            rank++;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = ak.get(arr[i]);
        }return arr;
    }
}