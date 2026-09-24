class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> ak = new HashMap<>();
        Map<Character, Integer> kb = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(char c : s.toCharArray()){
            ak.put(c,ak.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            kb.put(c,kb.getOrDefault(c, 0) + 1);
        }
        return ak.equals(kb);
    }
}