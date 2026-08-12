class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> ak = new HashMap<>();
        int rank = 1;
        int temp[] = arr.clone();
        Arrays.sort(temp);
        for(int i : temp){
            if(!ak.containsKey(i))  ak.put(i, rank++);
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = ak.get(arr[i]);
        }return arr;
    }
}