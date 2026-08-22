class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.equals("")) return 0;        
        String ak[] = s.split("\\s+");
        return ak.length;
    }
}