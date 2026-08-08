class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> ak = new HashMap<>();
        for(char a : s.toCharArray()){
            ak.put(a, ak.getOrDefault(a, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(char a : order.toCharArray()){
            if(s.indexOf(a) != -1){
                int n = ak.get(a);
                for(int i = 0; i<n; i++){
                    sb.append(a);
                }
            }
        }
        for(char a : s.toCharArray()){
            if(order.indexOf(a) == -1) sb.append(a);
        }
        return sb.toString();
    }
}