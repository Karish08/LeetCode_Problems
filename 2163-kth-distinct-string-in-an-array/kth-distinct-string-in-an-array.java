class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> ak = new LinkedHashMap<>();
        for(String m : arr){
            ak.put(m, ak.getOrDefault(m, 0)+1);
        }
        if(k > 0) k--;
        for(var entry : ak.entrySet()){
            if(entry.getValue() != 1) continue;
            else if(entry.getValue() == 1 && k == 0) return entry.getKey();
            else k--;
        }return "";
    }
}