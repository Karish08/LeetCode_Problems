class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> ak = new HashMap<>();
        for(int i : nums){
            ak.put(i, ak.getOrDefault(i,0)+1);
        }
        int m[] = new int[2];
        int i = 0;
        for(var entry : ak.entrySet()){
            if(entry.getValue() == 2){
                m[i++] = entry.getKey();
            }
        }
        return m;
    }
}