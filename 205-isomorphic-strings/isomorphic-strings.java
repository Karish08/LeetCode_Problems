class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> ak = new HashMap<>();
        HashMap<Character, Character> kb = new HashMap<>();
        if(s.length() != t.length()) return false;
        int i = 0;
        int j = 0;
        while(i < s.length()){
            if(ak.containsKey(s.charAt(i))){
                if(ak.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else {
                ak.put(s.charAt(i), t.charAt(i));
            }
             if(kb.containsKey(t.charAt(i))){
                if(kb.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
            else {
                kb.put(t.charAt(i), s.charAt(i));
            }
            i++;
        }return true;
    }
}