class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ak = new HashMap<>();
        HashMap<Character, Integer> kb = new HashMap<>();
        for(char a : ransomNote.toCharArray()){
            ak.put(a, ak.getOrDefault(a, 0) + 1);
        }
        for(char a : magazine.toCharArray()){
            kb.put(a, kb.getOrDefault(a, 0) + 1);
        }
        for(char a : ransomNote.toCharArray()){
            if(kb.get(a) == null) return false;
            if(ak.get(a) > kb.get(a)) return false;
        }return true;
    }
}