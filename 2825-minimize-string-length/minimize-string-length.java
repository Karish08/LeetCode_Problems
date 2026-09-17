class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> ak = new HashSet<>();
        for(char c : s.toCharArray()){
            ak.add(c);
        }
        return ak.size();
    }
}